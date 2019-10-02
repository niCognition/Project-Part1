package com.exercise.matchhistory;


import java.util.ArrayList;
import java.util.Collections;

public class CounterStrikeGo {
    private String csGoGameTag;
    private ArrayList<CsGoMatches> myCsGoMatches;

    /**
     * Constructor for CounterStrikeGo
     * @param csGoGameTag
     */

    public CounterStrikeGo(String csGoGameTag) {
        this.csGoGameTag = csGoGameTag;
        this.myCsGoMatches = new ArrayList<CsGoMatches>();
    }

    /**
     * Method to add new elements to ArrayList.
     * @param csGoMatches
     */

    public void addNewGame(CsGoMatches csGoMatches) {
        myCsGoMatches.add(csGoMatches);

    }

    //In case I want to add remove function
    /*
    private int findGames(String csGoMap) {
        for (int i = 0; i < this.myCsGoMatches.size(); i++) {
            CsGoMatches csGoMatches = this.myCsGoMatches.get(i);
            if (csGoMatches.getCsGoMap().equals(csGoMap)) {
                return i;
            }
        }
        return -1;
    }

    private CsGoMatches queryGames(String csGoMap) {
        int position = findGames(csGoMap);
        if (position >= 0) {
            return this.myCsGoMatches.get(position);
        }
        return null;
    }
    */

    public void printSortedByMap() {
        Collections.sort(myCsGoMatches, new SortByCsGoMap());
        printMatch();
    }
    /**
     * Method for printing Counter Strike:Global Offensive match history elements that's been added.
     */
    public void printMatch() {
            System.out.println("Counter Strike:Global Offensive: ");
            for (int i = 0; i < this.myCsGoMatches.size(); i++) {
                System.out.println((i + 1) + "." +
                        this.myCsGoMatches.get(i).getResult() + ", Map: " +
                        this.myCsGoMatches.get(i).getCsGoMap() + ", Kills: " +
                        this.myCsGoMatches.get(i).getKills() + ", Deaths: " +
                        this.myCsGoMatches.get(i).getDeaths() + ", Assists: " +
                        this.myCsGoMatches.get(i).getAssists() + ", Gametime: " +
                        this.myCsGoMatches.get(i).getGameTime() + " minutes.");
        }
    }

    public void printKDA() {
        System.out.println("KDA calculator for Counter Strike:Global Offensive games:");
        for (int i = 0; i < this.myCsGoMatches.size(); i++) {
            double kda = (double)((this.myCsGoMatches.get(i).getKills() + this.myCsGoMatches.get(i).getAssists()) / this.myCsGoMatches.get(i).getDeaths());
            System.out.println((i + 1) + ". " + this.myCsGoMatches.get(i).getCsGoMap() + " " + this.myCsGoMatches.get(i).getGameTime() + " minutes - KDA of game: " + kda);
        }
    }
}
