package com.spdata.site.factory;

import org.modelmapper.ModelMapper;

/**
 * Aplica o Design Patter de Factory para se caso seja necessario configurações
 * mais complexas no Model Mapper
 * 
 *
 *
 */
public class ModelMapperFactory {

	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
