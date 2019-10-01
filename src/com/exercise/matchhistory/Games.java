package com.exercise.matchhistory;

public class Games {
    private String result;
    private int kills;
    private int deaths;
    private int assists;
    private int gameTime;

    public Games(String result, int kills, int deaths, int assists, int gameTime) {
        this.result = result;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.gameTime = gameTime;
    }

    public String getResult() { return result; }
    public int getKills() { return kills; }
    public int getDeaths() { return deaths; }
    public int getAssists() { return assists; }
    public int getGameTime() { return gameTime; }
}
