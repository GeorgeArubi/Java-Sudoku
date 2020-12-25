package com.doghousetv.computationlogic;

import com.doghousetv.constants.GameState;
import com.doghousetv.sudoku.SudokuGame;

public class GameLogic {

    public static SudokuGame getNewGame() {
        return new SudokuGame(
                GameState.NEW,
                GameGenerator.getNewGameGrid()
        );
    }

    public static GameState checkForCompletion(int[][] grid) {
        if (sudokuIsInvalid(grid))
            return GameState.ACTIVE;

        if (tilesAreNotFilled(grid))
            return GameState.ACTIVE;

        return GameState.COMPLETE;
    }

    private static boolean sudokuIsInvalid(int[][] grid) {
        return false;
    }

    private static boolean tilesAreNotFilled(int[][] grid) {
        return false;
    }
}
