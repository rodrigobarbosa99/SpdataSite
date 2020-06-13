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
public class TipoContato implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long					id;
	
	@Column(length = 60)
	@NotNull
	private String					descricao; 
	

	@Column(length = 60)
	@NotNull
	private char					ativo;
	
	@Column(length = 60)
	@NotNull
	private String					email;
}