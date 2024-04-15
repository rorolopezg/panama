package tech.kopernicus.data.specification.example.dataspecexample.services.cursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import tech.kopernicus.data.specification.example.dataspecexample.model.entities.cursos.Curso;
import tech.kopernicus.data.specification.example.dataspecexample.repositories.cursos.JpaCursosRepository;

@Service
public class CursosService {
    @Autowired
    JpaCursosRepository repository;

    @Autowired
    @Qualifier("cursosEntityManagerFactory")
    private EntityManager entityManager;
    
    public List<Curso> findAll() {
        Query query = entityManager.createQuery("select c from Curso c");
        return repository.findAll();
        //return (List<Curso>)query.getResultList();
    }
}
