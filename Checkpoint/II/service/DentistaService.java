package com.dh.Checkpoint.II.service;

import com.dh.Checkpoint.II.persistence.model.Dentista;
import com.dh.Checkpoint.II.persistence.repository.DentistaRepository;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import org.apache.log4j.Logger;

@Service
public class DentistaService {
    final Logger logger;

    @Autowired
    private DentistaRepository repository;

    public Dentista insert(Dentista dentista){
        logger.info("Criando um dentista");
        return repository.save(dentista);

    }


    public void delete(Integer id){
        repository.deleteById(id);

        logger.info("Excluindo um dentista");
    }
    public List<Dentista> select(){

        logger.info("Mostrando todos os dentistas");
        return repository.findAll();

    }
    public Dentista  update(Dentista dentista){
        Dentista dentista1 = repository.getById(dentista.getId());
        dentista1.setNome(dentista.getNome());
        dentista1.setSobrenome(dentista.getSobrenome());

        logger.info("Atualizando um dentista");
        return repository.save(dentista1);


    }

    public DentistaService(){
        PropertyConfigurator.configure("log4j.properties.properties");
        this.logger = org.apache.log4j.Logger.getLogger(DentistaService.class);

    }
}
