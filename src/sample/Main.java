package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane borderPane = FXMLLoader.load(getClass().getResource("conceptmain.fxml"));
        primaryStage.setTitle("Main Menu");
        primaryStage.setScene(new Scene(borderPane,800, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
