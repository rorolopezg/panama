package com.kps.spring.boot.backend.apirest.models.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kps.spring.boot.backend.apirest.models.dao.ICustSiseRamoDao;
import com.kps.spring.boot.backend.apirest.models.entity.CustSiseRamo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

import java.util.List;

@Service
public class ProcedureInvoker {

    @Autowired
//    private ICustSiseRamoDao ramoRepo;
    private EntityManager entityManager;
    

    public List<CustSiseRamo> getRamos(Integer ramo) {
        StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("insis_cust_sura_uy.get_sise_ramos", CustSiseRamo.class);
        
        storedProcedure.registerStoredProcedureParameter("p_ramo_id", Integer.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("po_ref_cursor", void.class, ParameterMode.REF_CURSOR);
        storedProcedure.setParameter("p_ramo_id", ramo);
        storedProcedure.execute();
    	
        List<CustSiseRamo> ramos = storedProcedure.getResultList().stream().toList();
    	
//    	List<CustSiseRamo> ramos = ramoRepo.getSiseRamos(ramo);
    	
        return ramos;
    }
}
