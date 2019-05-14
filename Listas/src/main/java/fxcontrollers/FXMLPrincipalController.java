/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxcontrollers;

import Main.MainLog;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import org.slf4j.LoggerFactory;


/**
 * FXML Controller class Gestiona el BorderPane en el que se irán mostrando los
 * AnchorPane de cada una de las pantallas. Contiene la instancia de la clase
 * ZanalCar que irán usando todas las pantallas para realizar su funcionalidad.
 *
 * @author dam1
 */
public class FXMLPrincipalController implements Initializable {

    @FXML
    private BorderPane fxRoot;
    private AnchorPane altaVehiculo;
    
    /**
     * Initializes the controller class. Se inicializa la clase ZanalCar. Se
     * setea por defecto la pantalla de Comprar Vehículo.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
    }

    @FXML
    public void clickAltaVehiculo() {
         LoggerFactory.getLogger(MainLog.class.getName()).error("Traza de informacion");
        setAltaVehiculo();
    }

    @FXML
    public void clickVenderVehiculo() {
        setVenderVehiculo();
    }

    @FXML
    public void clickLavarVehiculos() {
        setLavarVehiculos();
    }

    @FXML
    public void clickFacturacion() {
    }

    @FXML
    public void clickProbarVehiculo() {
        setProbarVehiculo();
    }

    /**
     * Si la variable Anchor Pane no ha sido inicializada, lo hará desde el
     * archivo .fxml que la corresponde, a su Controller se le pasa el
     * BorderPane por parámetro en el método setPadreController() y la instancia
     * de ZanalCar mediante el método cargarZanalCar(). Luego, se carga el
     * AnchorPane en el BorderPane para mostrarlo por pantalla.
     */
    public void setAltaVehiculo() {
       
    }

    /**
     * Si la variable Anchor Pane no ha sido inicializada, lo hará desde el
     * archivo .fxml que la corresponde, a su Controller se le pasa el
     * BorderPane por parámetro en el método setPadreController() y la instancia
     * de ZanalCar mediante el método cargarZanalCar(). Luego, se carga el
     * AnchorPane en el BorderPane para mostrarlo por pantalla.
     */
    public void setVenderVehiculo() {
       
    }

    /**
     * Si la variable Anchor Pane no ha sido inicializada, lo hará desde el
     * archivo .fxml que la corresponde, a su Controller se le pasa el
     * BorderPane por parámetro en el método setPadreController() y la instancia
     * de ZanalCar mediante el método cargarZanalCar(). Luego, se carga el
     * AnchorPane en el BorderPane para mostrarlo por pantalla.
     */
    public void setLavarVehiculos() {
        
    }

    /**
     * Si la variable Anchor Pane no ha sido inicializada, lo hará desde el
     * archivo .fxml que la corresponde, a su Controller se le pasa el
     * BorderPane por parámetro en el método setPadreController() y la instancia
     * de ZanalCar mediante el método cargarZanalCar(). Luego, se carga el
     * AnchorPane en el BorderPane para mostrarlo por pantalla.
     */
    public void setProbarVehiculo() {
      
    }

}
