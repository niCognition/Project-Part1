package com.exercise.matchhistory;

import java.util.Comparator;

/**
 * Class for sorting Counter Strike:Global Offensive matches by Map name.
 */
public class SortByCsGoMap implements Comparator<CsGoMatches> {
    /**
     * Method to sort Counter Strike:Go ArrayList
     * @param a
     * @param b
     * @return
     */
    public int compare(CsGoMatches a, CsGoMatches b) {
        return a.getCsGoMap().compareTo(b.getCsGoMap());
    }
}
