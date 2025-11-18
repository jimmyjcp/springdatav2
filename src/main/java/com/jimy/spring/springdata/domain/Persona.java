package com.jimy.spring.springdata.domain;

import java.io.Serializable;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")

public class Persona implements Serializable{
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idPersona;

    @NotEmpty(message = "{NotEmpty.persona.nombre}")
    private String nombre;

    @NotEmpty(message = "{NotEmpty.persona.apellido}")
    private String apellido;

    @NotEmpty(message = "{NotEmpty.persona.email}")
    @Email(message = "{Email.persona.email}")
    private String email;

    private String telefono;

}
