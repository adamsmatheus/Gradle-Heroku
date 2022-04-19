package com.example.heroku.controller;

import com.example.heroku.model.Pokemon;
import com.example.heroku.service.PokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {

    @Autowired
    private PokeService pokeService;

    @RequestMapping("/pokemons")
    public List<Pokemon> getPokemonWithSubstring(@RequestParam("q") String substring) {

        return pokeService.searchWithSubstring(substring);
    }
}
