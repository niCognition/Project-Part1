package com.exercise.matchhistory;

public class CsGoMatches extends Games {
    private String csGoMap;     //Stage/Map

    public CsGoMatches(String result, int kills, int deaths, int assists, int gameTime, String csGoMap) {
        super(result, kills, deaths, assists, gameTime);
        this.csGoMap = csGoMap;
    }

    public String getCsGoMap() { return csGoMap; }

    public static CsGoMatches createCsGoMatches(String result, int kills, int deaths, int assists, int gameTime, String csGoMap) {
        return new CsGoMatches(result, kills, deaths, assists, gameTime, csGoMap);
    }
}
