package com.jimy.spring.springdata.service;

import java.util.List;

import com.jimy.spring.springdata.domain.Persona;

public interface PersonaService {
    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);

}
