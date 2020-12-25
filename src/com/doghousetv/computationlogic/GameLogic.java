package com.doghousetv.computationlogic;

import com.doghousetv.constants.GameState;
import com.doghousetv.sudoku.SudokuGame;

import static com.doghousetv.sudoku.SudokuGame.GRID_BOUNDARY;

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
        for (int xIndex = 0; xIndex < GRID_BOUNDARY; xIndex++) {
            for (int yIndex = 0; yIndex < GRID_BOUNDARY; yIndex++) {
                if (grid[xIndex][yIndex] == 0)
                    return true;
            }
        }
        return false;
    }

    
}
