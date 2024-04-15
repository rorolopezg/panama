package tech.kopernicus.data.specification.example.dataspecexample.services.people;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.kopernicus.data.specification.example.dataspecexample.model.entities.oracle.People;
import tech.kopernicus.data.specification.example.dataspecexample.repositories.oracle.JpaPeopleRepository;
import tech.kopernicus.data.specification.example.dataspecexample.repositories.oracle.ProcedureInvoker;

@Service
public class PeopleServiceImpl {
    @Autowired
    JpaPeopleRepository repository;

    @Autowired
    ProcedureInvoker invoker;

    public List<People> findAll() {
        return repository.findAll();
    }

    public List<People> executeProcedure() {
        return invoker.getPeople();
    }

    public void callTestProcedure() throws SQLException {
        invoker.callTestProcedure3();
    }
    
}
