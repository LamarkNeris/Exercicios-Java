package com.dh.Aula20.Controller;

import com.dh.Aula20.Domain.Bicho;
import com.dh.Aula20.Domain.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.dh.Aula20.service.PacienteService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class PacienteController {

    @Autowired
    private PacienteService service;

    @GetMapping("listar")
    public Map<Integer, Paciente> listarPacientes(){
        return service.buscarPacientes();
    }
    @GetMapping("criar")
    public Paciente criarPaciente(){
        return  service.criarPaciente();
    }

    @GetMapping("deletar/{id}")
    public String deletarPaciente(@PathVariable Integer id){
        service.deletarPaciente(id);
        return "Paciente deletado";
    }
    @GetMapping("jogarnoBicho")
    public Bicho buscarBicho(){
        return service.jogarnoBicho();
    }
    @GetMapping ("jogarnoBicho/{numero}")
    public List<Bicho> buscarBicho(@PathVariable Integer numero){
        List<Bicho> listaBicho = new ArrayList();
        for( int i = 0; i < numero; i++){
            listaBicho.add(service.jogarnoBicho());
        }
        return listaBicho;
    }
}
