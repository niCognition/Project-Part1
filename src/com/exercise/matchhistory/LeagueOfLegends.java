package com.exercise.matchhistory;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Control Class for League of Legends ArrayList and Methods.
 */
public class LeagueOfLegends {
    private String lolGameTag;
    private ArrayList<LolMatches> myLolMatches;

    /**
     * Constructor for LeagueOfLegends
     * @param lolGameTag
     */

    public LeagueOfLegends(String lolGameTag) {
        this.lolGameTag = lolGameTag;
        this.myLolMatches = new ArrayList<LolMatches>();
    }

    /**
     * Boolean method to check if game exists in arraylist adds new object if not found.
     * @param lolMatches
     * @return
     */

    public boolean addNewGame(LolMatches lolMatches) {
        if (findGames(lolMatches.getLolChampionName()) >=0) {
            System.out.println("Champion already saved.");
            return false;
        }

        myLolMatches.add(lolMatches);
        return true;
    }

    /**
     * Method to find specific matches in arraylist.
     * @param lolMatches
     * @return
     */
    private int findGames(LolMatches lolMatches) {
        return this.myLolMatches.indexOf(lolMatches);
    }

    /**
     * Overload of findGames with other parameters.
     * @param lolChampionName
     * @return
     */
    private int findGames(String lolChampionName) {
        for (int i = 0; i < this.myLolMatches.size(); i++) {
            LolMatches lolMatches = this.myLolMatches.get(i);
            if (lolMatches.getLolChampionName().equals(lolChampionName)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Method to return object in arraylist
     * @param lolMatches
     * @return
     */
    public String queryGames(LolMatches lolMatches) {
        if (findGames(lolMatches) >= 0) {
            return lolMatches.getLolChampionName();
        }
        return null;
    }

    /**
     * Overload of queryGames to use other parameters
     * @param lolChampionName
     * @return
     */
    public LolMatches queryGames(String lolChampionName) {
        int position = findGames(lolChampionName);
        if (position >= 0) {
            return this.myLolMatches.get(position);
        }
        return null;
    }

    /**
     * Method which uses the class SortByLolChampion to sort and print the sorted arraylist.
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

    /**
     * Method that takes the elements of every array in the arraylist and calculates KDA then prints the result.
     */
    public void printKDA() {
        System.out.println("KDA calculator for League of Legends games:");
        for (int i = 0; i < this.myLolMatches.size(); i++) {
            double kda = (double)((this.myLolMatches.get(i).getKills() + this.myLolMatches.get(i).getAssists()) / this.myLolMatches.get(i).getDeaths());
            System.out.println((i + 1) + ". " + this.myLolMatches.get(i).getLolChampionName() + " - KDA of game: " + kda);
        }
    }
}