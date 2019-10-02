package com.exercise.matchhistory;

/**
 * Sub Class for World of Warcraft.
 */
public class WowBattleground extends Games {
    private String wowBg;
    private int wowHonor;

    /**
     * Constructor for WowBattleground
     * @param result
     * @param kills
     * @param deaths
     * @param assists
     * @param gameTime
     * @param wowBg
     * @param wowHonor
     */
    public WowBattleground(String result, int kills, int deaths, int assists, int gameTime, String wowBg, int wowHonor) {
        super(result, kills, deaths, assists, gameTime);
        this.wowBg = wowBg;
        this.wowHonor = wowHonor;
    }

    /**
     * Get-set method for wowBg
     * @return
     */
    public String getWowBg() { return wowBg; }

    /**
     * Get-set method for wowHonor
     * @return
     */
    public int getWowHonor() { return wowHonor; }

    /**
     * Method to create new objects to place in ArrayList
     * @param result
     * @param kills
     * @param deaths
     * @param assists
     * @param gameTime
     * @param wowBg
     * @param wowHonor
     * @return object to ArrayList
     */
    public static WowBattleground createWowBattleground(String result, int kills, int deaths, int assists, int gameTime, String wowBg, int wowHonor) {
        return new WowBattleground(result, kills, deaths, assists, gameTime, wowBg, wowHonor);
    }
}
