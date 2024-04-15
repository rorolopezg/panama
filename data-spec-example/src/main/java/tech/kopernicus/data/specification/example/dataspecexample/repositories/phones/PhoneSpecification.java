package tech.kopernicus.data.specification.example.dataspecexample.repositories.phones;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import jakarta.persistence.criteria.Predicate;
import tech.kopernicus.data.specification.example.dataspecexample.model.entities.phones.Phone;

public class PhoneSpecification {

    public static Specification<Phone> filterPhone(String phoneBrand, String phoneName) {
        return (root, query, criteriaBuilder) -> {
            Predicate brandPredicate = criteriaBuilder.like(root.get("phoneBrand"),
                    StringUtils.isBlank(phoneBrand) ? likePattern("") : likePattern(phoneBrand));
            Predicate namePredicate = criteriaBuilder.like(root.get("phoneName"), 
                    StringUtils.isBlank(phoneName) ? likePattern("") : likePattern(phoneName));
            return criteriaBuilder.and(namePredicate, brandPredicate);
        };
    }

    public static Specification<Phone> searchPhone(String search) {
        return (root, query, criteriaBuilder) -> {
          Predicate brandPredicate = criteriaBuilder.like(root.get("phoneBrand"), likePattern(search));
          Predicate namePredicate = criteriaBuilder.like(root.get("phoneName"), likePattern(search));
          return criteriaBuilder.or(namePredicate, brandPredicate);
        };
    }

    private static String likePattern(String value) {
        return "%" + value + "%";
    }
}