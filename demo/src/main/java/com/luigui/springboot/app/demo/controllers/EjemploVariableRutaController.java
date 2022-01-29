package com.luigui.springboot.app.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariableRutaController {

    @GetMapping("/string{texto}")
    public String variables(@PathVariable("texto") String texto,Model model){
        model.addAttribute("titulo","Recibir parámetros de la ruta(@PathVariable)");
        model.addAttribute("resultado","El texto enviado es la ruta es: "+texto);
        return "variables/ver";
    }
}
