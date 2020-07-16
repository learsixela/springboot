package com.spring.web.controller;

import com.spring.web.services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VistaController {
	
    //responde a la ruta /hello/vista y deriva a JSP
    @RequestMapping("/vista")
    public String vista() {
        return "index.jsp";
    }

    //facilita la inyecion de dependencias
    @Autowired
    ApiService apiService;

    @RequestMapping({"/resultado"})
    public String index(Model model) {
        //parametros al jsp
        model.addAttribute("gimnasios", this.apiService.findAllGim());
        return "index.jsp";
    }

    @RequestMapping({"/"})
    public String agregar() {
        return "home.jsp";
    }
}
