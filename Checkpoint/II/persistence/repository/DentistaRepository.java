package com.dh.Checkpoint.II.persistence.repository;

import com.dh.Checkpoint.II.persistence.model.Dentista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistaRepository extends JpaRepository<Dentista, Integer> {

}
