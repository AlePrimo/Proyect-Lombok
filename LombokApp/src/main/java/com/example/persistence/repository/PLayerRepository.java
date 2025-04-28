package com.example.persistence.repository;

import com.example.persistence.entities.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PLayerRepository extends CrudRepository<Player, Long> {
}
