package com.exercise.matchhistory;

import java.util.Scanner;

public class MatchHistory {
    private static Scanner scanner = new Scanner(System.in);
    private static LeagueOfLegends leagueOfLegends = new LeagueOfLegends("niCognition");
    private static CounterStrikeGo counterStrikeGo = new CounterStrikeGo("niCognition");
    private static WorldOfWarcraft worldOfWarcraft = new WorldOfWarcraft("niCognition");

    public static void main(String[] args) {

        boolean quit = false;
        boolean subQuit = false;
        boolean sortLolQuit = false;
        boolean sortCsGoQuit = false;
        boolean sortWowBgQuit = false;
        matchHistory();
        printMainMenu();
        while(!quit) {
            System.out.println("\nChoose your destiny: (9 to show Main menu)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nClosing match history..");
                    quit = true;
                    break;
                case 1:
                    leagueOfLegends.printMatch();
                    counterStrikeGo.printMatch();
                    worldOfWarcraft.printMatch();
                    break;
                case 2:
                    while (!subQuit){
                        printSubMenu();
                        System.out.println("Choose your desired game: (4 to show sub menu)");
                        int subAction = scanner.nextInt();
                        scanner.nextLine();

                        switch (subAction) {
                            case 0:
                                System.out.println("\nBack to main menu..");
                                subQuit = true;
                                break;
                            case 1:
                                addNewLolMatch();
                                break;
                            case 2:
                                addNewCsGoMatch();
                                break;
                            case 3:
                                addNewWowBattleground();
                                break;
                            case 4:
                                printSubMenu();
                                break;
                        }
                    }
                    printMainMenu();
                    break;
                case 3:

                    while (!sortLolQuit){
                        printLolSortMenu();
                        System.out.println("Pick print option: (3 to show sort menu again)");
                        int sortLolAction = scanner.nextInt();
                        scanner.nextLine();

                        switch (sortLolAction) {
                            case 0:
                                System.out.println("\nBack to main menu..");
                                sortLolQuit = true;
                                break;
                            case 1:
                                leagueOfLegends.printSortedByChampion();
                                break;
                            case 2:
                                leagueOfLegends.printMatch();
                                break;
                            case 3:
                                printLolSortMenu();
                                break;
                        }
                    }
                    printMainMenu();
                    break;
                case 4:
                    while (!sortCsGoQuit) {
                        printCsGoSortMenu();
                        System.out.println("Pick print option: ");
                        int sortCsGoAction = scanner.nextInt();
                        scanner.nextLine();

                        switch (sortCsGoAction) {
                            case 0:
                                System.out.println("\nBack to main menu..");
                                sortCsGoQuit = true;
                                break;
                            case 1:
                                counterStrikeGo.printSortedByMap();
                                break;
                            case 2:
                                counterStrikeGo.printMatch();
                                break;
                            case 3:
                                printCsGoSortMenu();
                                break;
                        }
                    }
                    printMainMenu();
                    break;
                case 5:
                    while (!sortWowBgQuit) {
                        printWowSortMenu();
                        System.out.println("Pick print option: ");
                        int sortWowBgAction = scanner.nextInt();
                        scanner.nextLine();

                        switch (sortWowBgAction) {
                            case 0:
                                System.out.println("\nBack to main menu..");
                                sortWowBgQuit = true;
                                break;
                            case 1:
                                worldOfWarcraft.printSortedByBattleground();
                                break;
                            case 2:
                                worldOfWarcraft.printMatch();
                                break;
                            case 3:
                                printWowSortMenu();
                                break;
                        }
                    }
                    printMainMenu();
                    break;
                case 6:
                    leagueOfLegends.printKDA();
                    break;
                case 7:
                    counterStrikeGo.printKDA();
                    break;
                case 8:
                    worldOfWarcraft.printKDA();
                    break;
                case 9:
                    printMainMenu();
                    break;
            }
        }
    }
    //To remove or not remove duplicate if's, like the cs:go add match. that is the question..
    private static void addNewLolMatch() {
        System.out.println("Enter Victory or defeat: ");
        String result = scanner.nextLine();
        System.out.println("Enter champion name: ");
        String lolChampionName = scanner.nextLine();
        System.out.println("Enter number of kills: ");
        int kills = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number of deaths: ");
        int deaths = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number of assists: ");
        int assists = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter game length(minutes): ");
        int gameTime = scanner.nextInt();
        scanner.nextLine();
        LolMatches newLolMatch = LolMatches.createLolMatches(result, kills, deaths, assists, gameTime, lolChampionName);
        if (leagueOfLegends.addNewGame(newLolMatch)) {
            System.out.println("New League of Legends match added:");
            System.out.println("Result and Champion: " + result + " - " + lolChampionName + ", K/D/A: " + kills + "/" + deaths + "/" + assists + ", Game length: " + gameTime + " minutes.");
        } else {
            System.out.println("Cannot add, " + lolChampionName + " already in list.");
        }
    }

    private static void addNewCsGoMatch() {
        System.out.println("Enter Win or Loss: ");
        String result = scanner.nextLine();
        System.out.println("Enter Map: ");
        String csGoMap = scanner.nextLine();
        System.out.println("Enter number of kills: ");
        int kills = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number of deaths: ");
        int deaths = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number of assists: ");
        int assists = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter game length(minutes): ");
        int gameTime = scanner.nextInt();
        scanner.nextLine();
        CsGoMatches newCsGoMatch = CsGoMatches.createCsGoMatches(result, kills, deaths, assists, gameTime, csGoMap);
        counterStrikeGo.addNewGame(newCsGoMatch);
        System.out.println("New Counter Strike:Global Offensive match added:");
        System.out.println("Result and Map: " + result + " : " + csGoMap + ", K/D/A: " + kills + "/" + deaths + "/" + assists + ", Game length: " + gameTime + " minutes.");
    }

    private static void addNewWowBattleground() {
        System.out.println("Enter Victory or Defeat: ");
        String result = scanner.nextLine();
        System.out.println("Enter Battleground: ");
        String wowBg = scanner.nextLine();
        System.out.println("Enter number of kills: ");
        int kills = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number of deaths: ");
        int deaths = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number of assists: ");
        int assists = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter amount of honor gained: ");
        int wowHonor = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter game length(minutes): ");
        int gameTime = scanner.nextInt();
        scanner.nextLine();
        WowBattleground newWowBattleground = WowBattleground.createWowBattleground(result, kills, deaths, assists, gameTime, wowBg, wowHonor);
        worldOfWarcraft.addNewGame(newWowBattleground);
        System.out.println("New World of Warcraft battleground added:");
        System.out.println("Result and Battleground: " + result + " : " + wowBg + ", K/D/A: " + kills + "/" + deaths + "/" + assists + ", Honor gained: " + wowHonor + ", Bg length: " + gameTime + " minutes.");
    }

    private static void matchHistory() {
        System.out.println("\nBooting up match history..");
    }
    private static void printMainMenu() {
        System.out.println("\tMain menu:\n");
        System.out.println("\t 0 - Turn off\n" +
                "\t 1 - Show matches for all games\n" +
                "\t 2 - Add new game\n" +
                "\t 3 - Show League of Legends matches\n" +
                "\t 4 - Show Counter Strike:Global Offensive matches\n" +
                "\t 5 - Show World of Warcraft battlegrounds\n" +
                "\t 6 - Calculate KDA for League of Legends games\n" +
                "\t 7 - Calculate KDA for Counter Strike matches\n" +
                "\t 8 - Calculate KDA for World of Warcraft battlegrounds\n" +
                "\t 9 - Show Main menu\n");
    }

    private static void printSubMenu() {
        System.out.println("\tGame menu:\n");
        System.out.println("\t 0 - Back to Main menu\n" +
                "\t 1 - League of Legends\n" +
                "\t 2 - Counter Strike:Global Offensive\n" +
                "\t 3 - World of Warcraft battleground\n");
    }

    private static void printLolSortMenu() {
        System.out.println("\tPrint menu:");
        System.out.println("\t 0 - Back to Main menu\n" +
                "\t 1 - Sort by Champion name\n" +
                "\t 2 - Print in added order\n" +
                "\t 3 - Show print menu\n");
    }

    private static void printCsGoSortMenu() {
        System.out.println("\tPrint menu:");
        System.out.println("\t 0 - Back to Main menu\n" +
                "\t 1 - Sort by Map\n" +
                "\t 2 - Print in added order\n" +
                "\t 3 - Show print menu\n");
    }

    private static void printWowSortMenu() {
        System.out.println("\tPrint menu:");
        System.out.println("\t 0 - Back to Main menu\n" +
                "\t 1 - Sort by Battleground\n" +
                "\t 2 - Print in added order\n" +
                "\t 3 - Show print menu");
    }
}
