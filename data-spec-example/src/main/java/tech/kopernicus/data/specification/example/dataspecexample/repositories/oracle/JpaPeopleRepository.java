package tech.kopernicus.data.specification.example.dataspecexample.repositories.oracle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import tech.kopernicus.data.specification.example.dataspecexample.model.entities.oracle.People;


@Repository
public interface JpaPeopleRepository extends JpaRepository<People, Integer>{
    @NonNull
    List<People> findAll();

}
