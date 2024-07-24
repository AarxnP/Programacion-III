package com.springboot.controlador;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Lib2Controlador {
    @GetMapping("/lib2")
    public String Lib2(){
        return "lib2.html";
    }
}
