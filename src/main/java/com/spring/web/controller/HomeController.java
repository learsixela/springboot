package com.spring.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {
    //responde a la ruta /hello/world
    @RequestMapping("/world")
    public String hello() {
        return "Hello Controller World !";
    }

    //responde a la ruta /hello/inicio
    @RequestMapping("/inicio")
    public String index() {
        return "inicio";
    }

    //ruta con parametros dinamicos en url
    //ej: /hello/fecha/2020/01/01
    @RequestMapping("/fecha/{anio}/{mes}/{dia}")
    public String showLesson(@PathVariable("anio") String anio,
                             @PathVariable("mes") String mes,
                             @PathVariable("dia") String dia){
        return "Año: " + anio + "- Mes: " + mes + "- Día: " + dia;
    }

}
