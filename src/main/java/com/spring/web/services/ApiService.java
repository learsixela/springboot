package com.spring.web.services;


import com.spring.web.models.Gimnasio;
import com.spring.web.models.Persona;
import com.spring.web.repositories.GimnasioRepository;
import com.spring.web.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ApiService {
    @Autowired
    private PersonaRepository personaRepo;

    @Autowired
    private GimnasioRepository gimnasioRepo;

    //personas
    public List<Persona> findAllPersonas() {
        return this.personaRepo.findAll();
    }

    public Persona createPersona(Persona persona) {

        return personaRepo.save(persona);
    }
    //deportistas

    //gimnasios
    public List<Gimnasio> findAllGim() {
        return this.gimnasioRepo.findAll();
    }

    public Gimnasio findGim(Long id) {
        return this.gimnasioRepo.findById(id).orElse(null);
    }
    public Gimnasio createGim(Gimnasio gim) {
        return gimnasioRepo.save(gim);
    }
}
