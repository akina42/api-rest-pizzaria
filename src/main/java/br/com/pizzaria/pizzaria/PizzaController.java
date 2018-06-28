package br.com.pizzaria.pizzaria;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/pizzaria")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @PostMapping
    public ResponseEntity criar(@RequestBody PizzaDTO pizzaDTO){
        return new ResponseEntity(pizzaService.salvar(pizzaDTO), HttpStatus.CREATED);

    }

    @GetMapping()
    public ResponseEntity listar(){
        return new ResponseEntity(pizzaService.listar(), HttpStatus.OK);
    }

    @GetMapping("/findBy")
    public ResponseEntity obter(@RequestParam("id") UUID id){
        return new ResponseEntity(pizzaService.obter(id), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity remover(@RequestParam("id")UUID id) {
        this.pizzaService.remover(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
