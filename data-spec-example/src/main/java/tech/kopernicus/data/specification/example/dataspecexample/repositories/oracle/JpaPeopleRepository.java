package tech.kopernicus.data.specification.example.dataspecexample.repositories.oracle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import tech.kopernicus.data.specification.example.dataspecexample.model.entities.oracle.People;


@Repository
public interface JpaPeopleRepository extends JpaRepository<People, Integer>{
    @NonNull
    List<People> findAll();

    @Procedure(name = "FETCH_PEOPLE")
    List<People> findByProcedure(@Param("P_IN") String pIn);
}
