package com.dh.Checkpoint.II.service;

import com.dh.Checkpoint.II.persistence.model.Paciente;
import com.dh.Checkpoint.II.persistence.repository.PacienteRepository;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    final Logger logger;

    @Autowired
    private PacienteRepository repository;

    public Paciente insert(Paciente paciente){
        logger.info("Criando um paciente");
        return repository.save(paciente);
    }
    public List<Paciente> select(){
        logger.info("Mostrando todos os pacientes");
        return repository.findAll();
    }
    public void delete(Integer id){
        repository.deleteById(id);
        logger.info("Excluindo um paciente");
    }
    public Paciente  update(Paciente paciente){
        Paciente paciente1 = repository.getById(paciente.getId());
        paciente1.setNome(paciente.getNome());
        paciente1.setSobrenome(paciente.getSobrenome());
        logger.info("Atualizando um paciente");
        return repository.save(paciente1);
    }

    public PacienteService(){
        PropertyConfigurator.configure("log4j.properties.properties");
        this.logger = org.apache.log4j.Logger.getLogger(PacienteService.class);

    }
}
