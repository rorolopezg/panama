package com.kps.spring.boot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUST_SISE_RAMO")
public class CustSiseRamo implements Serializable {
	
	/**
	 * 
	 */
	@Id
	@Column(name = "COD_RAMO")
	private Integer codRamo;
	
	@Column(name = "TXT_DESC_ABREV")
	private String descAbrev;
	
	@Column(name = "TXT_DESC_REDU")
	private String descRedu;
	
	@Column(name = "TXT_DESC")
	private String desc;
	
	
	public Integer getCodRamo() {
		return codRamo;
	}
	public void setCodRamo(Integer codRamo) {
		this.codRamo = codRamo;
	}
	public String getDescAbrev() {
		return descAbrev;
	}
	public void setDescAbrev(String descAbrev) {
		this.descAbrev = descAbrev;
	}
	public String getDescRedu() {
		return descRedu;
	}
	public void setDescRedu(String descRedu) {
		this.descRedu = descRedu;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	private static final long serialVersionUID = 1L;
}
