package com.doghousetv;

import com.doghousetv.buildlogic.SudokuBuildLogic;
import com.doghousetv.userinterface.UserInterfaceImpl;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

public class SudokuApplication extends Application{
    private UserInterfaceImpl uiImpl;

    @Override
    public void start(Stage primaryStage) throws Exception{
        uiImpl = new UserInterfaceImpl(primaryStage);
        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
