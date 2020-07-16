package com.spring.web.controller;

import com.spring.web.models.Gimnasio;
import com.spring.web.services.ApiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class GimnasioController {
    private final ApiService appService;

    //constructor
    public GimnasioController(ApiService service) {
        this.appService = service;
    }
    @RequestMapping("/gimnasios")
    public String Index(Model model) {
        model.addAttribute("gimnasios", appService.findAllGim());
        return "/gimnasios/gimnasios.jsp";
    }
    @RequestMapping("/gimnasios/{id}")
    public String Show(@PathVariable("id") Long id, Model model) {
        System.out.println("el id es " +id);
        model.addAttribute("gimnasio", this.appService.findGim(id));
        return "/gimnasios/show.jsp";
    }
    @RequestMapping("/gimnasios/new")
    public String New(@ModelAttribute("gimnasio") Gimnasio gimnasio) {
        return "/gimnasios/new.jsp";
    }
    @RequestMapping(value="/gimnasios1", method= RequestMethod.POST)
    public String Create(@Valid @ModelAttribute("gimnasio") Gimnasio gimnasio, BindingResult result) {
        if(result.hasErrors())
            return "/gimnasios/new.jsp";
        this.appService.createGim(gimnasio);
        return "redirect:/gimnasios";
    }
}
