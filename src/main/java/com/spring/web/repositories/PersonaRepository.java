package com.spring.web.repositories;

import com.spring.web.models.Persona;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonaRepository extends CrudRepository<Persona, Long> {
    List<Persona> findAll();
}
