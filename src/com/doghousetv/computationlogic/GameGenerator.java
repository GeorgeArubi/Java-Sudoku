package com.doghousetv.computationlogic;

import com.doghousetv.sudoku.Coordinates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.doghousetv.sudoku.SudokuGame.GRID_BOUNDARY;

public class GameGenerator {
    public static int[][] getNewGameGrid() {
        return unsolvedGame(getSolvedGame());
    }

    private static int[][] getSolvedGame() {
        Random random = new Random(System.currentTimeMillis());
        int[][] newGrid = new int[GRID_BOUNDARY][GRID_BOUNDARY];

        for (int value = 1; value <= GRID_BOUNDARY; value++) {
            int allocations = 0;
            int interrupt = 0;

            List<Coordinates> allocTracker = new ArrayList<>();

            int attempts = 0;

            while (allocations < GRID_BOUNDARY) {
                if (interrupt > 200) {
                    allocTracker.forEach(coord -> {
                       newGrid[coord.getX()][coord.getY()] = 0;
                    });

                    interrupt = 0;
                    allocations = 0;
                    allocTracker.clear();
                    attempts++;

                    if (attempts > 500) {
                        clearArray(newGrid);
                        attempts = 0;
                        value = 1;
                    }
                }
            }
        }
        return new int[0][];
    }

    private static void clearArray(int[][] newGrid) {

    }
}
