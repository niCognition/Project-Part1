package com.exercise.matchhistory;

import java.util.Comparator;

public class SortByLolChampion implements Comparator<LolMatches> {
    public int compare(LolMatches a, LolMatches b) {
        return a.getLolChampionName().compareTo(b.getLolChampionName());
    }
}
