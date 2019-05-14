/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.slf4j.LoggerFactory;

/**
 * Clase que inicializa el entorno gráfico de JavaFX, en ella se carga y se
 * muestra el BorderPane que contendrá el resto de AnchorPane para cada
 * pantalla.
 *
 * @author dam1
 */
public class FXMLMain extends Application {

    /**
     * Se carga el archivo .fxml del Border Pane, se inicializa una variable
     * Border Pane con ese valor y se crea una scene a la que se pasa el
     * BorderPane. Finalmente se muestra la escena en el primaryStage.
     *
     * @param primaryStage
     * @throws IOException
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        //System.setProperty("log4j.configurationFile", "log4j2.xml");
      //  LoggerFactory.getLogger(MainLog.class.getName()).error("Traza de informacion");
        FXMLLoader loaderMenu = new FXMLLoader(getClass().getResource("/fxml/FXMLPrincipal.fxml"));
        BorderPane root = loaderMenu.load();

        Scene scene = new Scene(root);

        primaryStage.setTitle("ZanalCar");
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
