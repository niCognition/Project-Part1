package com.exercise.matchhistory;

import java.util.Comparator;

public class SortByBattleground implements Comparator<WowBattleground> {
    public int compare(WowBattleground a, WowBattleground b) {
        return a.getWowBg().compareTo(b.getWowBg());
    }
}
