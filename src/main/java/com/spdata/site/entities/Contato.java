package com.spdata.site.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Contato implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long					id;
	
	@Column(length = 60)
	@NotNull
	private String					nome; 
	
	@Column(length = 60)
	@NotNull
	private String					email;  
	
	@Column(length = 14)
	@NotNull
	private String					telefone;
	
	@Column(length = 60)
	@NotNull
	private String					nomeEmpresa;
	
	@Column(length = 60)
	@NotNull
	private String					cargo;
	
	@Column(length = 60)
	@NotNull
	private String					cidade;
	
	@Column(length = 60)
	@NotNull
	private String					estado;
	
	@Column(length = 100)
	@NotNull
	private String					mensagem;
	
	

}
