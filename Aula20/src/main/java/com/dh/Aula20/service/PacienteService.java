package com.dh.Aula20.service;

import com.dh.Aula20.Domain.Bicho;
import com.dh.Aula20.Domain.Paciente;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class PacienteService {
    private static Map<Integer, Paciente> flyweight = new HashMap<>();

    private static String[] nomesVec = {"Lucas", "Ana", "Pedro", "Julia", "Roberto",
            "Larissa", "Antonio", "Pietra", "Rubens", "Giovana"};

    private static String[] sobrenomesVec = {"Silva", "Santos", "Gomes", "Paglia", "Grisa",
            "Andrade", "Quinteiros", "Tempesta", "Franco", "Andrade"};

    public Map<Integer, Paciente> buscarPacientes(){
        return flyweight;
    }
    public Paciente criarPaciente(){
        Random random = new Random();
        Integer limiteRandom = 10;
        String nome = nomesVec[random.nextInt(limiteRandom)];
        String sobrenome = sobrenomesVec[random.nextInt(limiteRandom)];
        String email = (nome + sobrenome + "@gmail.com").toLowerCase();
        Integer id = flyweight.size() + 1;

        flyweight.put(id, new Paciente(nome, sobrenome, email, (random.nextInt(45-18+1) + 18)));


        return flyweight.get(id);
    }
    public void deletarPaciente(Integer id){
        flyweight.remove(id);
    }
    private static Map<String, Bicho> jogodoBicho = new HashMap<>();
    private static String[] bichos = {"vaca", "peru", "urso", "carneiro", "cobra", "burro", "cachorro", "águia", "tigre",
    "Avestruz",
            "Coelho",
             "Cavalo",
            "Elefante",
            "Galo",
            "Gato",
             "Jacaré",
            "Leão",
             "Macaco",
             "Porco", "veado", "pavão", "camelo", "cabra"};

    public Bicho jogarnoBicho(){
        Random random = new Random();
        Integer sorteio = 25;
        String nome = bichos[random.nextInt(sorteio)];
        jogodoBicho.put(nome, new Bicho(nome,(random.nextInt(bichos.length) )));
        return jogodoBicho.get(nome);

    }
}
