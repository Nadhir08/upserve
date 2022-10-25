package gui;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Luncher extends Application {

    

    @Override
    public void start(Stage primaryStage) throws Exception {
     
           
        Parent root;
        try {
            root=FXMLLoader.load(getClass().getResource("creecompte.fxml"));
             Scene scene = new Scene(root);
        
        primaryStage.setTitle("creer & sign in page");
        primaryStage.setScene(scene);
        primaryStage.show();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
