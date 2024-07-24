package com.springboot.controlador;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Lib1Controlador {
    @GetMapping("/lib1")
    public String Lib1(){
        return "lib1.html";
    }
}
