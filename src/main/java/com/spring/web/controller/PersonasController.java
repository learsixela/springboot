package com.spring.web.controller;

import com.spring.web.models.Persona;
import com.spring.web.services.ApiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class PersonasController {

    private ApiService appService;

    //constructor
    public PersonasController(ApiService service) {

        this.appService = service;
    }

    @RequestMapping("/personas") //url de acceso
    public String Index(Model model) {
        List<Persona> personas = this.appService.findAllPersonas();
        model.addAttribute("personas",personas);//pasar parametros al jsp
        return "/personas/personas.jsp";
    }

    @RequestMapping("/personas/new")
    public String New(@ModelAttribute("persona") Persona persona, Model model) {

        System.out.println("gimnasios *** " +this.appService.findAllGim());
        model.addAttribute("gimnasios", this.appService.findAllGim());
        return "/personas/nuevo.jsp";
    }
    @RequestMapping(value="/personas", method= RequestMethod.POST)
    public String Create(@Valid @ModelAttribute("persona") Persona persona, BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute("gimnasios", this.appService.findAllGim());
            return "/personas/nuevo.jsp";
        }
        this.appService.createPersona(persona);
        return "redirect:/personas";
    }
}
