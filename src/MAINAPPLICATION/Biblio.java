/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAINAPPLICATION;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Dorra
 */
public class Biblio extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
      //  FXMLLoader loader = new FXMLLoader(getClass().getResource("Affichercategorie.fxml")) ;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/GUI/AffichageDocuments.fxml")) ;
         //  FXMLLoader loader = new FXMLLoader(getClass().getResource("supprimerdocuments_admin.fxml")) ;

        Parent root=loader.load() ;
        Scene scene = new Scene(root);
        
        
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
