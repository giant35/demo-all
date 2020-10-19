package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button();
        btn.setText("hello");
        btn.setOnAction(e -> {
            System.out.println("hee");
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 300, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
