package com.doghousetv.computationlogic;

import com.doghousetv.constants.GameState;
import com.doghousetv.constants.Rows;
import com.doghousetv.sudoku.SudokuGame;

import java.util.*;

import static com.doghousetv.sudoku.SudokuGame.GRID_BOUNDARY;

public class GameLogic {

    public static SudokuGame getNewGame() {
        return new SudokuGame(
                GameState.NEW,
                GameGenerator.getNewGameGrid()
        );
    }

    public static GameState checkForCompletion(int[][] grid) {
        if (sudokuIsInvalid(grid)) return GameState.ACTIVE;
        if (tilesAreNotFilled(grid)) return GameState.ACTIVE;
        return GameState.COMPLETE;
    }

    private static boolean sudokuIsInvalid(int[][] grid) {
        if (rowsAreInvalid(grid)) return true;
        if (columnsAreInvalid(grid)) return true;
        if (squaresAreInvalid(grid)) return true;
        else return false;
    }

    private static boolean rowsAreInvalid(int[][] grid) {
        return false;
    }

    private static boolean columnsAreInvalid(int[][] grid) {
        return false;
    }

    private static boolean squaresAreInvalid(int[][] grid) {
        if (rowsOfSquaresInvalid(Rows.TOP, grid)) return true;
        if (rowsOfSquaresInvalid(Rows.MIDDLE, grid)) return true;
        if (rowsOfSquaresInvalid(Rows.BOTTOM, grid)) return true;
        return false;
    }

    private static boolean rowsOfSquaresInvalid(Rows top, int[][] grid) {
        switch(value) {
            case TOP:
                if (squareIsInvalid(0, 0, grid)) return true;
                if (squareIsInvalid(0, 3, grid)) return true;
                if (squareIsInvalid(0, 6, grid)) return true;
                return false;
        }
    }

    private static boolean squareIsInvalid(int xIndex, int yIndex, int[][] grid) {
        int yIndexEnd = yIndex + 3;
        int xIndexEnd = xIndex + 3;

        List<Integer> square = new ArrayList<>();

        while (yIndex)
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
