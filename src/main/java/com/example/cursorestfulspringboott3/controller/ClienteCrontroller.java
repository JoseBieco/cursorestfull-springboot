package com.example.cursorestfulspringboott3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteCrontroller {
    
    @GetMapping("/cliente")
    public String getClientes(){
        return "Vai retornar TODOS os clientes";
    }

    @GetMapping("/cliente/{codigo}")
    public String getCliente(@PathVariable int codigo){
        return "Vai retornar UM Cliente pelo codigo : " + codigo;
    }
}