package com.mantovani.gameList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mantovani.gameList.dto.GameMinTdo;
//import com.mantovani.gameList.entities.Game;
import com.mantovani.gameList.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinTdo> findAll() {
		List<GameMinTdo> result = gameService.findAll();
		
		return result;
	}
}
