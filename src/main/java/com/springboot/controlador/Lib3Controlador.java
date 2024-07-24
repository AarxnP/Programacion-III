package com.springboot.controlador;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Lib3Controlador {
    @GetMapping("/lib3")
    public String Lib3(){
        return "lib3.html";
    }
}
