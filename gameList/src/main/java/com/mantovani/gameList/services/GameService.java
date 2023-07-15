package com.mantovani.gameList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mantovani.gameList.dto.GameMinTdo;
import com.mantovani.gameList.entities.Game;
import com.mantovani.gameList.repositories.GameRepository;

@Service	
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinTdo> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinTdo(x)).toList();
		
	}
}
