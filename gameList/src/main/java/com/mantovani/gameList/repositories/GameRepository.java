package com.mantovani.gameList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mantovani.gameList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
