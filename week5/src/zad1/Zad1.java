/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;



/**
 *
 * @author dzhel
 */
public class Zad1 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
     Group root = new Group();
        Scene scene= new Scene(root, 300,350);
        Random random = new Random();
        double width = (int) scene.getWidth();
        double hheight = (int) scene.getHeight();
        Point aPoint=new Point(new int[](random.nextInt((int)width),rendom.nextInt((int)height)));
    }
}
