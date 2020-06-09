package com.spdata.site.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spdata.site.entities.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> 
{

}
