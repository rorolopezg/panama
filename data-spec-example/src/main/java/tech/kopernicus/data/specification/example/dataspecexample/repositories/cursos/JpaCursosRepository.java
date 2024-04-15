package tech.kopernicus.data.specification.example.dataspecexample.repositories.cursos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import tech.kopernicus.data.specification.example.dataspecexample.model.entities.cursos.Curso;

public interface JpaCursosRepository extends JpaRepository<Curso, Integer>{
    @NonNull
    List<Curso> findAll();

}
