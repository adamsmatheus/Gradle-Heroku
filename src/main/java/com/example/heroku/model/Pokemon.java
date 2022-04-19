package com.example.heroku.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


public class Pokemon {

    private String name;
    private String nameWithHighlight;

    public Pokemon(String name, String nameWithHighlight) {
        this.name = name;
        this.nameWithHighlight = nameWithHighlight;
    }

    public Pokemon() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameWithHighlight() {
        return nameWithHighlight;
    }

    public void setNameWithHighlight(String nameWithHighlight) {
        this.nameWithHighlight = nameWithHighlight;
    }
}
