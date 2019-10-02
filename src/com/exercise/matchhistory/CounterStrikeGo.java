package com.exercise.matchhistory;


import java.util.ArrayList;
import java.util.Collections;

/**
 * Control Class for Counter Strike:Global Offensive ArrayList and Methods.
 */
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
     * Method to add new objects to ArrayList.
     * @param csGoMatches
     */

    public void addNewGame(CsGoMatches csGoMatches) {
        myCsGoMatches.add(csGoMatches);

    }

    /**
     * Method which uses the class SortByCsGoMap to sort and print the sorted arraylist.
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

    /**
     * Method that takes the elements of every array in the arraylist and calculates KDA then prints the result.
     */
    public void printKDA() {
        System.out.println("KDA calculator for Counter Strike:Global Offensive games:");
        for (int i = 0; i < this.myCsGoMatches.size(); i++) {
            double kda = (double)((this.myCsGoMatches.get(i).getKills() + this.myCsGoMatches.get(i).getAssists()) / this.myCsGoMatches.get(i).getDeaths());
            System.out.println((i + 1) + ". " + this.myCsGoMatches.get(i).getCsGoMap() + " " + this.myCsGoMatches.get(i).getGameTime() + " minutes - KDA of game: " + kda);
        }
    }
}
