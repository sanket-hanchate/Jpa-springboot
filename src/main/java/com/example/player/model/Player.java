package com.example.player.model;

import javax.persistence.*;

@Entity
@Table(name = "team")
public class Player {
    @Id
    @Column(name = "playerid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerId;
    @Column(name = "playername")
    private String playerName;
    @Column(name = "jerseynumber")
    private int jerseyNumber;
    @Column(name = "role")
    private String role;

    public Player() {
    }

    public Player(int playerId, String playerName, int jerseyNumber, String role) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }
}