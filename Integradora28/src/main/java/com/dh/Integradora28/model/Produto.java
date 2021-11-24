package com.dh.Integradora28.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
    private String nome;
    private Integer quantidade;
    private String descricao;

    public Produto(String nome, Integer quantidade, String descricao) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }
}
