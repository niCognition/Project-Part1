package com.exercise.matchhistory;

import java.util.Comparator;

/**
 * Class for sorting World of Warcraft games by Battleground name.
 */
public class SortByBattleground implements Comparator<WowBattleground> {
    /**
     * Method to sort World of Warcraft ArrayList
     * @param a
     * @param b
     * @return
     */
    public int compare(WowBattleground a, WowBattleground b) {
        return a.getWowBg().compareTo(b.getWowBg());
    }
}
