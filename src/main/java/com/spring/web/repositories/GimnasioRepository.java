package com.spring.web.repositories;

import com.spring.web.models.Gimnasio;
import com.spring.web.models.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GimnasioRepository extends CrudRepository<Gimnasio, Long> {
    List<Gimnasio> findAll();
}
