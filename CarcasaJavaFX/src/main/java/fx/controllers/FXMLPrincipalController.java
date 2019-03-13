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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author oscar
 */
public class FXMLPrincipalController implements Initializable {

  @FXML
  private TextField fxTxtNombre;

  
  private FXMLTuPutaMadreController tuputoPadre;

  public void setTuputoPadre(FXMLTuPutaMadreController tuputoPadre) {
    this.tuputoPadre = tuputoPadre;
  }
  
  
  @FXML
  public void clickBoton(ActionEvent event) {

//    Alert alert = new Alert(AlertType.INFORMATION);
//    alert.setTitle("Information Dialog");
//    alert.setHeaderText(null);
//    alert.setContentText("Hola "+fxTxtNombre.getText());
//    
//    alert.showAndWait();
    tuputoPadre.setNombre(fxTxtNombre.getText());
    tuputoPadre.cargarPag2();
  }

  public void resetear()
  {
    fxTxtNombre.setText(null);
  }
  
  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
    fxTxtNombre.setPromptText("lo he cambiado por codigo");
  }

}
