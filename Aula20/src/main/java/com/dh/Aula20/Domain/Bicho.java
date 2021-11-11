package com.dh.Aula20.Domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bicho {
    private String nome;
    private Integer numero;

    public Bicho(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }
}
