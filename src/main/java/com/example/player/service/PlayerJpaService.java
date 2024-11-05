package com.example.player.service;

import com.example.player.repository.PlayerRepository;
import com.example.player.model.Player;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.player.repository.PlayerJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;

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
	public com.example.player.repository.Player getPlayerById(int playerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.example.player.repository.Player addPlayer(com.example.player.repository.Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.example.player.repository.Player updatePlayer(int playerId,
			com.example.player.repository.Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePlayer(int playerId) {
		// TODO Auto-generated method stub

	}

}