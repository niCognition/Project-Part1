package com.exercise.matchhistory;


import java.util.Comparator;

/**
 * Class for sorting League of Legends matches by champion name.
 */
public class SortByLolChampion implements Comparator<LolMatches> {
    /**
     * Method to sort League of legends ArrayList
     * @param a
     * @param b
     * @return
     */
    public int compare(LolMatches a, LolMatches b) {
        return a.getLolChampionName().compareTo(b.getLolChampionName());
    }
}
