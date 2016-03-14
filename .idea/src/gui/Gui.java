package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by fpiplip on 14.03.2016.
 */
public class Gui extends Application {

    @Override
    public void start(Stage primaryStage)  {

        Button sendButton = new Button("menno");
        BorderPane root = new BorderPane();
        root.setCenter(sendButton);
        Scene scene = new Scene(root,600,400);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
