package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class App extends Application {

    public void start(Stage stage) throws Exception {
        MenuItem item1 = new MenuItem("2222");
        Menu m1 = new Menu("test", null, item1);
        MenuBar b = new MenuBar(m1);
        b.useSystemMenuBarProperty().set(true);
        stage.setScene(new Scene(b, 100, 100));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
