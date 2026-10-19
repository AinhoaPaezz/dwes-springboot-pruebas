package com.restaurante.demo.controller;

import com.restaurante.demo.entities.Plato;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class Restaurantecontroller {


    private List<Plato> platos;

    @GetMapping("/")
    public String lista(){
        return "index";
    }

    //borrar plato

    //nuevo plato

    //editar plato + manejo de ingredientes

    //detalle
}
