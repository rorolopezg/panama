package tech.kopernicus.data.specification.example.dataspecexample.services.people;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.kopernicus.data.specification.example.dataspecexample.model.entities.oracle.CustSiseRamo;
import tech.kopernicus.data.specification.example.dataspecexample.model.entities.oracle.People;
import tech.kopernicus.data.specification.example.dataspecexample.repositories.oracle.JpaPeopleRepository;
import tech.kopernicus.data.specification.example.dataspecexample.repositories.oracle.ProcedureInvoker;

@Service
public class PeopleServiceImpl {
    @Autowired
    JpaPeopleRepository repository;

    @Autowired
    ProcedureInvoker invoker;

    @Transactional(readOnly = true)
    public List<People> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public List<People> findByProcedure(String pIn) {
        return repository.findByProcedure(pIn);
    }

    @Transactional(readOnly = true)
    public List<People> executeProcedure() {
        return invoker.getPeople();
    }

    @Transactional(readOnly = true)
    public void callTestProcedure() throws SQLException {
        invoker.callTestProcedure4();
    }


    public List<CustSiseRamo> getRamos(Integer ramo) {
        return invoker.getRamos(ramo);
    }
    
}
