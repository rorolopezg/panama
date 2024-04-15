package tech.kopernicus.data.specification.example.dataspecexample.repositories.oracle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.transaction.Transactional;
import tech.kopernicus.data.specification.example.dataspecexample.model.entities.oracle.People;

@Repository
@Transactional
public class ProcedureInvoker {
    @PersistenceContext(unitName="oracleEntityManagerFactory")
    private EntityManager entityManager;

    public List<People> getPeople() {
        List <People> peoples = new ArrayList<>();
        peoples.add(new People(1L, "Rodrigo", "López"));
        StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("RMLG_PKG.TEST", People.class);
        storedProcedure.registerStoredProcedureParameter("p_in", People.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("p_out", String.class, ParameterMode.OUT);
        storedProcedure.setParameter("p_in", peoples);
        storedProcedure.execute();
        String pOut = storedProcedure.getParameter("p_out").getName();
        System.out.println(pOut);
        
        return peoples;
    }
}