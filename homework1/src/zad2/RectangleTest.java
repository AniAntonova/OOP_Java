package zad2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class RectangleTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        Rectangle rectangle = new Rectangle();
        String widthValue=new String();
        String heightValue=new String();
        do {
            try {
                 widthValue = inputDialog("Write width", "Rectangle", "It should be a number\nFor example 5");
                double width = Double.parseDouble(widthValue);
                if (width > 0) {
                    rectangle.setWidth(width);
                } else {
                    messageDialog("Invalid width", "Error", null);
                }
            } catch (NumberFormatException e) {
                messageDialog("Invalid width", "Error", null);
            }
        } while (rectangle.getWidth() == 0);

        do {
            try {
                heightValue = inputDialog("Write height", "Rectangle", "It should be a number\nFor example 7");
                double height = Double.parseDouble(heightValue);
                if (height > 0) {
                    rectangle.setHeight(height);
                } else {
                    messageDialog("Invalid height", "Error", null);
                }
            } catch (NumberFormatException e) {
                messageDialog("Invalid height", "Error", null);
            }
        } while (rectangle.getHeight() == 0);
        
        String color = inputDialog("Write color", "Ractangle", null);

        String message = String.format("Width:  %s\nHeight:  %s\nColor:  %s\nArea:  %s\nPerimeter:  %s",widthValue,heightValue,color, Double.toString(rectangle.getArea()), Double.toString(rectangle.getPerimeter()));
        messageDialog(message, "Parameters value", null);

    }

    public static void messageDialog(String infoMessage, String titleBar, String headerMessage) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titleBar);
        alert.setHeaderText(headerMessage);
        alert.setContentText(infoMessage);
        alert.showAndWait();
    }

    public static String inputDialog(String infoMessage, String titleBar, String headerMessage) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle(titleBar);
        dialog.setHeaderText(headerMessage);
        dialog.setContentText(infoMessage);
        return dialog.showAndWait().get();
    }

}
