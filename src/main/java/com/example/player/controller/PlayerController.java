package com.example.player.controller;

import org.springframework.web.bind.annotation.*;
import com.example.player.model.Player;
import com.example.player.service.PlayerJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@RestController
class PlayerController {
    @Autowired
    public PlayerJpaService playerService;

    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {
        return playerService.getPlayers();
    }

}
