package br.com.pizzaria.pizzaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    PizzaRepository pizzaRepository;

    @Override
    public Pizza salvar(PizzaDTO pizzaDTO) {
        Pizza pizza = new Pizza(pizzaDTO.getMassa(), pizzaDTO.getQueijo(), pizzaDTO.getMolho(), pizzaDTO.getSabor(), pizzaDTO.getTempoDePreparo());
        return this.pizzaRepository.save(pizza);
    }

    @Override
    public Pizza editar(UUID id, PizzaDTO pizzaDTO) {
        return null;
    }

    @Override
    public Pizza obter(UUID id) {
        return this.pizzaRepository.findOne(id);
    }

    @Override
    public ArrayList<Pizza> listar() {
        return this.pizzaRepository.findAll();
    }
}
