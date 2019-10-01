package com.exercise.matchhistory;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueOfLegends {
    private String lolGameTag;
    private ArrayList<LolMatches> myLolMatches;


    public LeagueOfLegends(String lolGameTag) {
        this.lolGameTag = lolGameTag;
        this.myLolMatches = new ArrayList<LolMatches>();
    }


    public boolean addNewGame(LolMatches lolMatches) {
        if (findGames(lolMatches.getLolChampionName()) >=0) {
            System.out.println("Champion already saved.");
            return false;
        }

        myLolMatches.add(lolMatches);
        return true;
    }


    private int findGames(String lolChampionName) {
        for (int i = 0; i < this.myLolMatches.size(); i++) {
            LolMatches lolMatches = this.myLolMatches.get(i);
            if (lolMatches.getLolChampionName().equals(lolChampionName)) {
                return i;
            }
        }
        return -1;
    }
    //In case I want to add remove function
    /*
    private LolMatches queryGames(String lolChampionName) {
        int position = findGames(lolChampionName);
        if (position >= 0) {
            return this.myLolMatches.get(position);
        }
        return null;
    }
    */

    public void printSortedByChampion() {
        Collections.sort(myLolMatches, new SortByLolChampion());
        printMatch();
    }

    /**
     * Method for printing League of Legends match history elements that's been added.
     */

    public void printMatch() {
            System.out.println("League of Legends: ");
            for (int i = 0; i < this.myLolMatches.size(); i++) {
                System.out.println((i + 1) + "." +
                        this.myLolMatches.get(i).getLolChampionName() + ", Kills: " +
                        this.myLolMatches.get(i).getKills() + ", Deaths: " +
                        this.myLolMatches.get(i).getDeaths() + ", Assists: " +
                        this.myLolMatches.get(i).getAssists() + ", Gametime: " +
                        this.myLolMatches.get(i).getGameTime() + " minutes.");
        }
    }

    public void printKDA() {
        System.out.println("KDA calculator for League of Legends games:");
        for (int i = 0; i < this.myLolMatches.size(); i++) {
            double kda = (double)((this.myLolMatches.get(i).getKills() + this.myLolMatches.get(i).getAssists()) / this.myLolMatches.get(i).getDeaths());
            System.out.println((i + 1) + ". " + this.myLolMatches.get(i).getLolChampionName() + " - KDA of game: " + kda);
        }
    }
}