package com.kps.spring.boot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.kps.spring.boot.backend.apirest.models.entity.CustSiseRamo;

public interface ICustSiseRamoDao extends JpaRepository<CustSiseRamo, Integer>{
	
	@Procedure(name = "GET_SISE_RAMOS", outputParameterName = "test_ref_cursor")
    List<CustSiseRamo> getSiseRamos(@Param("p_ramo_id") Integer ramoId);

}
