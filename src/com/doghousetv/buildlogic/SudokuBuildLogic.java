package com.doghousetv.buildlogic;

import com.doghousetv.computationlogic.GameLogic;
import com.doghousetv.sudoku.IStorage;
import com.doghousetv.sudoku.SudokuGame;
import com.doghousetv.userinterface.IUserInterfaceContract;
import com.doghousetv.userinterface.logic.ControlLogic;

import java.io.IOException;

public class SudokuBuildLogic {
    public static void build(IUserInterfaceContract.View userInterface) throws IOException {
        SudokuGame initialState;
        IStorage storage = new LocalStorageImpl();

        try {
            initialState = storage.getGameData();
        } catch (IOException e) {
            initialState = GameLogic.getNewGame();
            storage.updateGameData(initialState);
        }

        IUserInterfaceContract.EventListener uiLogic = new ControlLogic(storage, userInterface);

        userInterface.setListener(uiLogic);
        userInterface.updateBoard(initialState);
    }
}
