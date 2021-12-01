package com.dh.Checkpoint.II.persistence.model;

import javax.persistence.*;


@Entity
@Table
public class Paciente {


    @Id
    @SequenceGenerator(name = "paciente_sequencia", sequenceName = "paciente_sequencia", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paciente_sequencia")
    private Integer id;
    private String nome;
    private String sobrenome;


    public Paciente( String nome, String sobrenome ) {

        this.nome = nome;
        this.sobrenome = sobrenome;

    }
    public Paciente(){

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
