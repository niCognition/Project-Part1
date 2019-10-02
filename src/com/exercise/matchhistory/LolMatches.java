package com.exercise.matchhistory;

/**
 * Sub Class for League Of Legends.
 */
public class LolMatches extends Games {
    private String lolChampionName;

    /**
     * Constructor for LolMatches
     * @param result
     * @param kills
     * @param deaths
     * @param assists
     * @param gameTime
     * @param lolChampionName
     */
    public LolMatches(String result, int kills, int deaths, int assists, int gameTime, String lolChampionName) {
        super(result, kills, deaths, assists, gameTime);
        this.lolChampionName = lolChampionName;
    }

    /**
     * Get-set method for lolChampionName
     * @return
     */
    public String getLolChampionName() { return lolChampionName; }

    /**
     * Method to create new objects to place in ArrayList
     * @param result
     * @param kills
     * @param deaths
     * @param assists
     * @param gameTime
     * @param lolChampionName
     * @return object to ArrayList
     */
    public static LolMatches createLolMatches(String result, int kills, int deaths, int assists, int gameTime, String lolChampionName) {
        return new LolMatches(result, kills, deaths, assists, gameTime, lolChampionName);
    }
}
