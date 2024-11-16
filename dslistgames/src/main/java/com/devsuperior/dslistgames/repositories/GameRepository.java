package com.devsuperior.dslistgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslistgames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
