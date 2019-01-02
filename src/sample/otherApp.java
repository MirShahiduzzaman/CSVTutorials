package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class otherApp extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        VBox vBox = new VBox(new Label("A JavaFX Label"));
        Scene scene = new Scene(vBox);

        /*

        --FULL SCREEN TUTORIAL--
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);

        primaryStage.show();

        */

        Stage stage = new Stage();

        stage.setX(500);
        stage.setY(300);

        stage.setWidth(600);
        stage.setHeight(300);

        stage.setTitle("JavaFX Stage Window Title");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }
}
