package com.example.aula_24_08_20.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    // para pegar ao todo
    @GetMapping("/cliente")
    public String getClientes(){
        return "Vai retornar todos os clientes";
    }
    
    // para pegar alguem pelo codigo 
    @GetMapping("/cliente/{codigo}")
    public String getClienteByCodigo(@PathVariable int codigo){
        return "Vai retornar o cliente de codigo: " + codigo;
    }

}
