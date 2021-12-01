package com.dh.Checkpoint.II.persistence.repository;

import com.dh.Checkpoint.II.persistence.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

}
