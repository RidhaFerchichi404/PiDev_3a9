package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainMenu extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Charger la scène du menu principal
        Parent root = FXMLLoader.load(getClass().getResource("/MainMenu.fxml"));
        primaryStage.setTitle("User Management Menu");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
