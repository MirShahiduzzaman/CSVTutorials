package sample;

import com.sun.org.apache.xpath.internal.operations.Mod;
import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StageExamples extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("JavaFX App");

        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);

        //stage.initModality(Modality.APPLICATION_MODAL);
        //stage.initModality(Modality.NONE);

        stage.initOwner(primaryStage);
        stage.initStyle(StageStyle.DECORATED);

        //stage.initStyle(StageStyle.UNDECORATED);
        //stage.initStyle(StageStyle.TRANSPARENT);
        //stage.initStyle(StageStyle.UNIFIED);
        //stage.initStyle(StageStyle.UTILITY);

        primaryStage.show();

        stage.showAndWait();
    }
}
