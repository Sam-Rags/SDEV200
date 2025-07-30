import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a button and place it in the scene
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);
        prmaryStage.setTitle("MyJavaFX"); // set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        prmaryStage.show();
    }

    /** The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
