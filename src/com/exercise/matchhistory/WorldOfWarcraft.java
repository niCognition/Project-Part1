package com.exercise.matchhistory;

import java.util.ArrayList;
import java.util.Collections;

public class WorldOfWarcraft {
    private String wowGameTag;
    private ArrayList<WowBattleground> myWowBattleground;

    public WorldOfWarcraft(String wowGameTag) {
        this.wowGameTag = wowGameTag;
        this.myWowBattleground = new ArrayList<WowBattleground>();
    }

    public void addNewGame(WowBattleground wowBattleground) {
        myWowBattleground.add(wowBattleground);
    }

    public void printSortedByBattleground() {
        Collections.sort(myWowBattleground, new SortByBattleground());
        printMatch();
    }

    public void printMatch() {
            System.out.println("World of Warcraft Battleground PvP: ");
            for (int i = 0; i < this.myWowBattleground.size(); i++) {
                System.out.println((i + 1) + "." +
                    this.myWowBattleground.get(i).getResult() + ", Battleground: " +
                    this.myWowBattleground.get(i).getWowBg() + ", Kills: " +
                    this.myWowBattleground.get(i).getKills() + ", Deaths: " +
                    this.myWowBattleground.get(i).getDeaths() + ", Assists: " +
                    this.myWowBattleground.get(i).getAssists() + ", Honor: " +
                    this.myWowBattleground.get(i).getWowHonor() + ", Gametime: " +
                    this.myWowBattleground.get(i).getGameTime() + " minutes.");
        }
    }

    public void printKDA() {
        System.out.println("KDA calculator for World of Warcraft battlegrounds:");
        for (int i = 0; i < this.myWowBattleground.size(); i++) {
            double kda = (double)((this.myWowBattleground.get(i).getKills() + this.myWowBattleground.get(i).getAssists()) / this.myWowBattleground.get(i).getDeaths());
            System.out.println((i + 1) + ". " + this.myWowBattleground.get(i).getWowBg() + " " + this.myWowBattleground.get(i).getWowHonor() + " Honor - KDA of game: " + kda);
        }
    }
}
