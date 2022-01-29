package com.luigui.springboot.app.demo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.luigui.springboot.app.demo.models.Usuario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {
    
    @GetMapping({"/index","home"})
    public String home(Model model){
        model.addAttribute("titulo", "Hola spring framework");
        return "index";
    }
    /*@GetMapping({"/index","/","home"})
    public String home(Map<String,Object>map){
        map.put("titulo", "Hola spring framework");
        return "index";
    }*/

    /*
     /*@GetMapping({"/index","/","home"})
    public ModelAndView home(ModelAndView mv){
        mv.addObject("titulo", "Hola spring framework");
        mv.setViewName("index");
        return mv;
    }
    */

    @GetMapping("/perfil")
    public String perfil(Model model){
        Usuario usuario = new Usuario();
        usuario.setNombre("Luis");
        usuario.setApellido("López");
        usuario.setEmail("luis@usuario.com");
        model.addAttribute("usuario",usuario);
        model.addAttribute("titulo", "Perfil de usuario ".concat(usuario.getNombre()));
        return "perfil";
    }
    @GetMapping("/listar")
    public String listar(Model model){
        model.addAttribute("titulo","Listado de usuarios");
        
        return "listar";
    }
    @ModelAttribute("usuarios")
    public List<Usuario> llenarList(){
        List<Usuario> usuarios = Arrays.asList(new Usuario("Andres","Guzman","anddres@gmail.com"),
        new Usuario("José","Torres","josé@gmail.com"),new Usuario("Luis","Montes","jl03@gmail.com"));
        return usuarios;
    }
}

