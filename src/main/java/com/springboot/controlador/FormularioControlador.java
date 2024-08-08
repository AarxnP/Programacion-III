package com.springboot.controlador;

import com.springboot.Entidad.Usuario;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormularioControlador {
    @GetMapping("/formulario")
    public String Formulario(Model model){
        model.addAttribute("usuario",new Usuario());
        return "formulario.html";
    }
    @PostMapping("/registrarUsuario")
    public String registrarUsuario(@Valid @ModelAttribute Usuario usuario, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("errors",bindingResult.getAllErrors());
            return "formulario.html";
        }else {
            return "registro_exitoso.html";
        }
    }
}
