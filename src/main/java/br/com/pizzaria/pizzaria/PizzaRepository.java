package br.com.pizzaria.pizzaria;

import java.util.ArrayList;
import java.util.UUID;

public interface PizzaRepository {

    Pizza save(Pizza pizza);
    ArrayList<Pizza> findAll();
    void delete(Pizza pizza);
    Pizza findOne(UUID id);
}
