package com.devsuperior.dslistgames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslistgames.dto.GameMinimoDTO;
import com.devsuperior.dslistgames.entities.Game;
import com.devsuperior.dslistgames.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
      
	public List<GameMinimoDTO> findAll(){
		
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinimoDTO(x)).toList();
	}
}
