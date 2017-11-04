package zad1;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class TestConvert extends Application {

    // public static void main(String[] args) {
    // }
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        Celsius cel = new Celsius();
        Fahrenheit fahr = new Fahrenheit();
        String celValue = inputDialog("Write celsius", "Celsius to Fahrenheit", null);
        cel.setCelsius(Double.parseDouble(celValue));
        String message =String.format("This is %s fahrenheits!",Double.toString(cel.convertToFahrenheit()));
        messageDialog(message,"Converted value",null);
        String fahrValue = inputDialog("Write fahrenheit", "Fahrenheit to Celsius", null);
        fahr.setFahrenheit(Double.parseDouble(fahrValue));
        String message2 =String.format("This is %s celsius!",Double.toString(fahr.convertToCelsius()));
        messageDialog(message2,"Converted value",null);
    }

    public static void messageDialog(String infoMessage, String titleBar, String headerMessage) {
        Alert alert = new Alert(AlertType.INFORMATION);
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
