package com.exercise.matchhistory;

/**
 * Super Class for all games which holds the parameters the games have in common.
 */
public class Games {
    private String result;
    private int kills;
    private int deaths;
    private int assists;
    private int gameTime;

    /**
     * Constructor for Super Class Games
     * @param result
     * @param kills
     * @param deaths
     * @param assists
     * @param gameTime
     */
    public Games(String result, int kills, int deaths, int assists, int gameTime) {
        this.result = result;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.gameTime = gameTime;
    }

    /**
     * Get-set method for result.
     * @return result
     */
    public String getResult() { return result; }

    /**
     * Get-set method for kills
     * @return kills
     */
    public int getKills() { return kills; }

    /**
     * Get-set method for deaths
     * @return
     */
    public int getDeaths() { return deaths; }

    /**
     * Get-set method for assists
     * @return
     */
    public int getAssists() { return assists; }

    /**
     * Get-set method for gameTime
     * @return gameTime
     */
    public int getGameTime() { return gameTime; }
}
