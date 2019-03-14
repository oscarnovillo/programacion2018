/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author oscar
 */
public class FXMLBorderPaneController implements Initializable {

  @FXML
  private BorderPane fxRoot;

  private Alert alert;

  private String nombre;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  
  
  
  private AnchorPane pagPrincipal;
  private AnchorPane pag2;
  private FXMLPrimeraPantallaController principalController;
  private FXMLPagina2Controller pag2Controller; 


  public FXMLPagina2Controller getPag2Controller() {
    return pag2Controller;
  }

  @FXML
  public void cargar1(ActionEvent event) {

    cargarPrincipal();
  }

  public void cargarPrincipal() {
    try {
      if (pagPrincipal == null) {
	FXMLLoader loaderMenu
		= new FXMLLoader(getClass().getResource("/fxml/FXMLPrimeraPantalla.fxml"));
	pagPrincipal = loaderMenu.load();
	principalController = loaderMenu.getController();
	principalController.setBorderPane(this);
      }
      principalController.resetear();
      fxRoot.setCenter(pagPrincipal);

    } catch (Exception ex) {
      Logger.getLogger(FXMLBorderPaneController.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  
   private void preCargarPag2() {
    try {
      FXMLLoader loaderMenu
	      = new FXMLLoader(getClass().getResource("/fxml/FXMLPagina2.fxml"));
      pag2 = loaderMenu.load();
      pag2Controller = loaderMenu.getController();
      pag2Controller.setPrincipalController(this);
    } catch (Exception ex) {
      Logger.getLogger(FXMLBorderPaneController.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
	
	
  public void cargarPag2() {
      fxRoot.setCenter(pag2);
  }

  @FXML
  public void cargar2(ActionEvent event) {
    cargarPag2();

  }

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
    alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Information Dialog");
    alert.setHeaderText(null);
    preCargarPag2();
    cargarPrincipal();
  }

}
