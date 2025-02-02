package game;

import java.util.HashMap;

import static game.CellConstants.EMPTY;
import static game.CellConstants.FIXED;

public class Games {
    private HashMap<Integer, Game> gamesHashMap;

    private static Games instance;

    private Games() {
        gamesHashMap = new HashMap<>();
        addInitialGames();
    }

    public static Games getInstance() {
        if (instance == null) {
            instance = new Games();
        }
        return instance;
    }

    public void addInitialGames() {

        Game game1 = new Game();
        game1.setInitialValues(new int[][]{
                {0, 0, 9, 0, 8, 6, 2, 0, 0},
                {2, 3, 0, 0, 7, 0, 0, 9, 6},
                {0, 6, 0, 0, 1, 0, 0, 0, 5},
                {5, 0, 3, 0, 0, 0, 0, 8, 0},
                {0, 9, 0, 1, 2, 5, 0, 6, 0},
                {0, 4, 0, 0, 0, 0, 1, 0, 7},
                {7, 0, 0, 0, 0, 9, 6, 1, 0},
                {0, 8, 1, 0, 4, 0, 0, 0, 3},
                {3, 0, 6, 0, 0, 1, 4, 0, 0}
        });

        game1.setInitialVisibility(new String[][]{
                {EMPTY, EMPTY, FIXED, EMPTY, FIXED, FIXED, FIXED, EMPTY, EMPTY},
                {FIXED, FIXED, EMPTY, EMPTY, FIXED, EMPTY, EMPTY, FIXED, FIXED},
                {EMPTY, FIXED, EMPTY, EMPTY, FIXED, EMPTY, EMPTY, EMPTY, FIXED},
                {FIXED, EMPTY, FIXED, EMPTY, EMPTY, EMPTY, EMPTY, FIXED, EMPTY},
                {EMPTY, FIXED, EMPTY, FIXED, FIXED, FIXED, EMPTY, FIXED, EMPTY},
                {EMPTY, FIXED, EMPTY, EMPTY, EMPTY, EMPTY, FIXED, EMPTY, FIXED},
                {FIXED, EMPTY, EMPTY, EMPTY, EMPTY, FIXED, FIXED, FIXED, EMPTY},
                {EMPTY, FIXED, FIXED, EMPTY, FIXED, EMPTY, EMPTY, EMPTY, FIXED},
                {FIXED, EMPTY, FIXED, EMPTY, EMPTY, FIXED, FIXED, EMPTY, EMPTY}
        });
//    game.Game game2 = new game.Game();
//        game2.setInitialValues(new int[][]{
//        {0, 1, 8, 0, 6, 0, 0, 0, 0},
//        {3, 0, 0, 0, 4, 2, 1, 0, 3},
//        {6, 0, 0, 8, 4, 0, 0, 0, 4},
//        {4, 0, 2, 3, 3, 1, 4, 3, 1},
//        {2, 8, 1, 0, 3, 6, 1, 6, 2},
//        {0, 3, 0, 1, 0, 0, 5, 9, 8},
//        {0, 4, 0, 0, 0, 3, 7, 0, 0},
//        {0, 6, 0, 7, 0, 5, 0, 0, 9},
//        {7, 2, 0, 0, 0, 9, 0, 0, 0}
//    });
//
//        game2.setInitialVisibility(new boolean[][]{
//        {false, true, true, false, true, false, false, false, false},
//        {true, false, false, false, true, true, true, false, true},
//        {true, false, false, true, true, false, false, false, true},
//        {true, false, false, true, false, false, true, false, true},
//        {false, true, true, false, true, false, true, false, false},
//        {true, false, true, true, false, true, true, false, true},
//        {false, true, false, false, true, true, true, false, false},
//        {true, false, true, false, true, false, true, false, true},
//        {true, true, false, false, false, true, false, false, false}
//    });


        gamesHashMap.put(1, game1);

    }

    public HashMap<Integer, Game> getGamesHashMap() {
        return gamesHashMap;
    }

    public Game getGame(int value) {
        if (value > gamesHashMap.size()) {
            System.err.println("Invalid");
            throw new RuntimeException();
        }
        return gamesHashMap.get(value);
    }
}