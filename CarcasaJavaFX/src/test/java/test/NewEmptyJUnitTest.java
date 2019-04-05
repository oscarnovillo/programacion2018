/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
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

/**
 *
 * @author oscar
 */
@ExtendWith(ApplicationExtension.class)
public class NewEmptyJUnitTest {

    public NewEmptyJUnitTest() {
    }

    @Start
    private void start(Stage primaryStage) throws IOException {
        FXMLLoader loaderMenu
                = new FXMLLoader(getClass().getResource("/fxml/FXMLBorderPane.fxml"));
        BorderPane root = loaderMenu.load();

        Scene scene = new Scene(root);

        primaryStage.setTitle("Carcasa FX");
        primaryStage.setScene(scene);
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello(FxRobot robot) {
        robot.clickOn("#fxMenuP");
        robot.clickOn("#fxMenu");
    }
}
