package com.exercise.matchhistory;

/**
 * Sub Class for Counter Strike:Global Offensive.
 */

public class CsGoMatches extends Games {
    private String csGoMap;

    /**
     * Constructor for CsGoMatches
     * @param result
     * @param kills
     * @param deaths
     * @param assists
     * @param gameTime
     * @param csGoMap
     */
    public CsGoMatches(String result, int kills, int deaths, int assists, int gameTime, String csGoMap) {
        super(result, kills, deaths, assists, gameTime);
        this.csGoMap = csGoMap;
    }

    /**
     * Get-set method for csGoMap
     * @return
     */
    public String getCsGoMap() { return csGoMap; }

    /**
     * Method to create new objects to place in ArrayList
     * @param result
     * @param kills
     * @param deaths
     * @param assists
     * @param gameTime
     * @param csGoMap
     * @return object to ArrayList
     */
    public static CsGoMatches createCsGoMatches(String result, int kills, int deaths, int assists, int gameTime, String csGoMap) {
        return new CsGoMatches(result, kills, deaths, assists, gameTime, csGoMap);
    }
}
