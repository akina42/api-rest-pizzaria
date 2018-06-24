package br.com.pizzaria.pizzaria;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.UUID;

@Component
public class PizzaRepositoryImpl implements PizzaRepository {

    private ArrayList<Pizza> pizzas = new ArrayList<>();


    @Override
    public Pizza save(Pizza pizza) {
        pizzas.add(pizza);
        return pizzas.get(pizzas.size() - 1);
    }

    @Override
    public ArrayList<Pizza> findAll() {
        return pizzas;
    }

    @Override
    public void delete(Pizza pizza) {

    }

    @Override
    public Pizza findOne(UUID id) {
        return null;
    }
}
