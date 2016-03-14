package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by fpiplip on 14.03.2016.
 */
public class gui_main extends Application {
    public gui_main() {
    }

    public void start(Stage primaryStage) throws Exception {
        Button sendButton = new Button("seeeeeend");
        BorderPane root = new BorderPane();
        root.setCenter(sendButton);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300.0D, 275.0D));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
