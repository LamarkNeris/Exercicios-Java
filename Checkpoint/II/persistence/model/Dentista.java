package com.dh.Checkpoint.II.persistence.model;


import javax.persistence.*;

@Entity
@Table
public class Dentista {

    @Id
    @SequenceGenerator(name = "dentista_sequencia", sequenceName = "dentista_sequencia", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dentista_sequencia")
    private Integer id;
    private String nome;
    private String sobrenome;


    public Dentista(String nome, String sobrenome) {

        this.nome = nome;
        this.sobrenome = sobrenome;

    }
    public Dentista(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
