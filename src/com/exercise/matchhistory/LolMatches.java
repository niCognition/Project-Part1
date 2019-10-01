package com.exercise.matchhistory;

public class LolMatches extends Games {
    private String lolChampionName;

    public LolMatches(String result, int kills, int deaths, int assists, int gameTime, String lolChampionName) {
        super(result, kills, deaths, assists, gameTime);
        this.lolChampionName = lolChampionName;
    }

    public String getLolChampionName() { return lolChampionName; }

    public static LolMatches createLolMatches(String result, int kills, int deaths, int assists, int gameTime, String lolChampionName) {
        return new LolMatches(result, kills, deaths, assists, gameTime, lolChampionName);
    }
}
