package br.com.pizzaria.pizzaria;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;


public interface PizzaService {

    Pizza salvar(PizzaDTO pizzaDTO);
    Pizza editar(UUID id, PizzaDTO pizzaDTO);
    Pizza obter(UUID id);
    ArrayList<Pizza> listar();
    void remover(UUID id);
}
