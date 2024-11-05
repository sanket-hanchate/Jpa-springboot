package com.example.player.service;

import com.example.player.repository.PlayerRepository;
import com.example.player.model.Player;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.player.repository.PlayerJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

@Service
public class PlayerJpaService implements PlayerRepository {
	@Autowired
	private PlayerJpaRepository playerJpaRepository;

	@Override
	public ArrayList<Player> getPlayers() {
		List<Player> playerList = playerJpaRepository.findAll();
		ArrayList<Player> players = new ArrayList<>(playerList);
		return players;
	}

	@Override
	public Player getPlayerById(int playerId) {
		try {
			Player player = playerJpaRepository.findById(playerId).get();
			return player;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public Player addPlayer(Player player) {
		return new Player(12, "Prince", 24, "Bowler");
	}

	@Override
	public Player updatePlayer(int playerId, Player player) {
		return new Player(2, "Yuvi", 12, "All-rounder");
	}

	@Override
	public void deletePlayer(int playerId) {

	}
}