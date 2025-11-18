package com.jimy.spring.springdata.dao;

import org.springframework.data.repository.CrudRepository;

import com.jimy.spring.springdata.domain.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long>{

}
