package com.spdata.site.dtosTipoContato;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoContatoResponseDto {
	 
	 private Long					id;
     private String					descricao; 
     private char					ativo;
 	 private String					email;
}
