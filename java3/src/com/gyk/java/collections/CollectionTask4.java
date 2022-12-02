package com.gyk.java.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionTask4 {

    //Create 4 game objects with these properties.
    //Create ArrayList and add Games.
    //Use foreach to go through array of games and print it.
    //For printing use toString
    //Remove second game
    //Move Printing to the method and print list again.
    //Sort list using reverse order.

    public static void main(String[] args) {

        Game runeScape = new Game("Rune Scape", GameGenre.MMORPG, 11.9, 20000);
        Game dota2 = new Game("DOTA2", GameGenre.MOBA, 19.9, 30000);
        Game csgo = new Game("CS:GO", GameGenre.FPS, 25.9, 40000);
        Game aoe2 = new Game("Age of Empires 2", GameGenre.STRATEGY, 9.9, 50000);

        ArrayList<Game> games = new ArrayList<>();
        games.addAll(
                List.of(
                        runeScape,
                        dota2,
                        csgo,
                        aoe2
                )
        );

        System.out.println("List of games:");
        for (Game game: games) {
            System.out.println(game);
        }

        System.out.println("---------------------------");

        games.remove(1);

        for (Game game: games) {
            game.printInfo();
        }

        System.out.println("---------------------------");

        games.sort(Comparator.reverseOrder());

        System.out.println("Sort games by copies sold reverse:");
        for (Game game: games) {
            game.printInfo();
        }

    }

}
