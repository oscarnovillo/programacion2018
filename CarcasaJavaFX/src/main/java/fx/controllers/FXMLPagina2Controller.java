/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author oscar
 */
public class FXMLPagina2Controller implements Initializable {

  
  private FXMLTuPutaMadreController principalController;

  public void setPrincipalController(FXMLTuPutaMadreController principalController) {
    this.principalController = principalController;
  }
  
  
   @FXML
  public void clickBoton(ActionEvent event) {

    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Information Dialog");
    alert.setHeaderText(null);
    alert.setContentText("Hola desde Pag 2" + 
	    principalController.getNombre());
    
    alert.showAndWait();
   
  }
  
  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  
  
}
