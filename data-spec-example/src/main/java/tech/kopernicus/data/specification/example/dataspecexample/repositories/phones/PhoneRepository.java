package tech.kopernicus.data.specification.example.dataspecexample.repositories.phones;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import tech.kopernicus.data.specification.example.dataspecexample.model.entities.phones.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer>, JpaSpecificationExecutor<Phone>{
    @NonNull
    List<Phone> findAll(@NonNull Specification<Phone> specification);
}
