package com.exercise.matchhistory;

public class WowBattleground extends Games {
    private String wowBg;
    private int wowHonor;

    public WowBattleground(String result, int kills, int deaths, int assists, int gameTime, String wowBg, int wowHonor) {
        super(result, kills, deaths, assists, gameTime);
        this.wowBg = wowBg;
        this.wowHonor = wowHonor;
    }

    public String getWowBg() { return wowBg; }
    public int getWowHonor() { return wowHonor; }

    public static WowBattleground createWowBattleground(String result, int kills, int deaths, int assists, int gameTime, String wowBg, int wowHonor) {
        return new WowBattleground(result, kills, deaths, assists, gameTime, wowBg, wowHonor);
    }
}
