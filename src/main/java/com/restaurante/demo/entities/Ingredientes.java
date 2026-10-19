package com.restaurante.demo.entities;

public class Ingredientes {

    private Long id;
    private String nombre;

    public Ingredientes(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public  Long getId(){
     return id;
    }

    public String getNombre() {
        return nombre;
    }
}
