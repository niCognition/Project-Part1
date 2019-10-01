package com.exercise.matchhistory;

import java.util.Comparator;

public class SortByCsGoMap implements Comparator<CsGoMatches> {
    public int compare(CsGoMatches a, CsGoMatches b) {
        return a.getCsGoMap().compareTo(b.getCsGoMap());
    }
}
