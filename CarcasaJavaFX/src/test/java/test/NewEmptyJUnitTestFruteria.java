/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import main.FXMain;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

import fx.controllers.FXMLBorderPaneController;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
//import model.Fruta;
import org.junit.jupiter.api.TestMethodOrder;

/**
 *
 * @author oscar
 */
@ExtendWith(ApplicationExtension.class)
@TestMethodOrder(OrderAnnotation.class)
public class NewEmptyJUnitTestFruteria {

    public NewEmptyJUnitTestFruteria() {
    }

    private static FXMLBorderPaneController rootController;
    private static BorderPane root;

    @Start
    private void start(Stage primaryStage) throws IOException {

        try {
            if (root == null) {
                FXMLLoader loaderMenu = new FXMLLoader(NewEmptyJUnitTestFruteria.class.getResource("/fxml/FXMLBorderPane.fxml"));
                root = loaderMenu.load();
                rootController = loaderMenu.getController();
                Scene scene = new Scene(root);

                primaryStage.setTitle("Carcasa FX");
                primaryStage.setScene(scene);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        primaryStage.show();
    }

    @BeforeAll
    public static void setUpClass() {

    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    @Order(1)
    public void jj(FxRobot robot) {
        robot.clickOn("#fxMenuP");
        robot.sleep(1000);
        robot.clickOn("#fxMenuStock");
        robot.sleep(1000);
        ((ListView) robot.lookup("#fxListFrutas").query()).getSelectionModel().selectFirst();
        robot.sleep(1000);

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    @Order(0)
    public void hello(FxRobot robot) {
        robot.clickOn("#fxMenuP");
        robot.clickOn("#fxMenuAddFruta");
        ((TextField) robot.lookup("#fxTextNombre").query()).setText("Fruta 1");
        ((TextField) robot.lookup("#fxTextPrecio").query()).setText("1");
        ((TextField) robot.lookup("#fxTextKilos").query()).setText("1");
        robot.clickOn("#btAddFruta");
//        Fruta f = rootController.getF().getFrutas().stream().filter((fruta) -> {
//            return fruta.getNombre().equals("Fruta 1"); //To change body of generated lambdas, choose Tools | Templates.
//        }).findFirst().get();
 //       assertEquals(f.getPrecioVenta(), 1);
    }

}
