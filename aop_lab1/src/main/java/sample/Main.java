package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.repository.ToDoRepository;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/start.fxml"));
        ToDoRepository repository = new ToDoRepository("xpyacxfd", "xpyacxfd", "RDiHLKNCYmZ7yOKOPY3yZIBAf1ueqU6u");
        StartController controller = new StartController(repository);
        loader.setController(controller);
        Parent root = loader.load();
        primaryStage.setTitle("To Do List");
        primaryStage.setScene(new Scene(root, 602, 335));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
