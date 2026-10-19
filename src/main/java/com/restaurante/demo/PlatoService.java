package com.restaurante.demo;

import com.restaurante.demo.entities.Ingredientes;
import com.restaurante.demo.entities.Plato;
import com.restaurante.demo.entities.TipoPlato;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlatoService {
    private List<Ingredientes> ingredientes = new ArrayList<>();
    private List<Plato> platos = new ArrayList<>();

    private  Long contador = 1L;

    public PlatoServise() {
        ingredientes.add(new Ingredientes(1L, "Tomate"));
        ingredientes.add(new Ingredientes(2L, "Pollo"));
        ingredientes.add(new Ingredientes(3L, "Lechuga"));
        ingredientes.add(new Ingredientes(4L, "Chocolate"));

        platos.add(new Plato(contador++, "Ensalda Cesar", 8.50, TipoPlato.PRIMERO, List.of(ingredientes.get(0), ingredientes.get(2))));
        platos.add(new Plato(contador++, "Pollo al horno", 13, TipoPlato.SEGUNDO, List.of(ingredientes.get(1))));
        platos.add(new Plato(contador++, "Tarta de chocolate", 6.50, TipoPlato.POSTRE, List.of(ingredientes.get(3))));
    }
    public List<Plato> listar(){
        return platos;
    }
    public Plato buscarPorId(Long id){
        for (Plato plato: platos) {
            if (plato.getId().equals(id)) {
                return plato;
            }
        }
        return null;
    }
    public void crear(Plato plato) {
        Plato nuevo = new Plato(contador++, plato.getNombre(), plato.getPrecio(), plato.getTipo(), plato.getIngredinetes());
        platos.add(nuevo);
    }
}
