package tech.kopernicus.data.specification.example.dataspecexample.services.phones;

import java.lang.reflect.Field;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import tech.kopernicus.data.specification.example.dataspecexample.model.entities.phones.Phone;
import tech.kopernicus.data.specification.example.dataspecexample.repositories.phones.PhoneRepository;
import tech.kopernicus.data.specification.example.dataspecexample.repositories.phones.PhoneSpecification;

@Service
@RequiredArgsConstructor
public class PhoneService {

    @Autowired
    private final PhoneRepository phoneRepository;

    @Autowired
    @Qualifier("phoneEntityManagerFactory")
    private EntityManager entityManager;

    public List<Phone> findAllPhones(String phoneName, String phoneBrand) {
        final Specification<Phone> specification = PhoneSpecification.filterPhone(phoneBrand, phoneName);
        final List<Phone> phones = phoneRepository.findAll(specification);
        //entityManager.toString()
        return phones;
    }

    private void filterFields(Object object, List<String> fields) {
        try {
            Class<?> clazz = object.getClass();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(JsonIgnore.class)) {
                    continue;
                }
                if (field.getType().equals(String.class) || field.getType().isPrimitive()) {
                    if (!fields.contains(field.getName())) {
                        field.set(object, null);
                    }
                } else {
                    filterFields(field.get(object), fields);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
