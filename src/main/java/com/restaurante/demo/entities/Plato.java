package com.restaurante.demo.entities;

import java.util.List;

public class Plato {

    private Long id;
    private String nombre;
    private Double precio;
    private TipoPlato tipo;
    private List<Ingredientes> ingredinetes;

    public Plato(Long id, String nombre, Double precio, TipoPlato tipo, List<Ingredientes> ingredientes){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.ingredinetes = ingredientes;
    }
    public Long getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public Double getPrecio() {
        return precio;
    }
    public TipoPlato getTipo() {
        return tipo;
    }
    public List<Ingredientes> getIngredinetes() {
        return ingredinetes;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public void setTipo(TipoPlato tipo) {
        this.tipo = tipo;
    }

    public void setIngredinetes(List<Ingredientes>ingredinetes) {
        this.ingredinetes = ingredinetes;
    }
}
