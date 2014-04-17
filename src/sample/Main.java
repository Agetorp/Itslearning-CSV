package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
<<<<<<< HEAD
//Testkommentar

=======

    //Testar att lägga in en kommentar
>>>>>>> 09ebf543fafbec4f7a9c80162fc1d6bd5bf65240
    public static void main(String[] args) {
        launch(args);
    }
}
