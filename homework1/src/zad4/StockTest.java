package zad4;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;


public class StockTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        String symbol = inputDialog("Write symbol of the Stock!", "Stock", null);
        String name = inputDialog("Write name of the Stock!", "Stock", null);
        Stock stock = new Stock(symbol, name);
        String currentPriceValue = new String();
        String previousPriceValue = new String();
        do {
            try {
                currentPriceValue = inputDialog("Write current price!", "Stock", "It should be a number\nFor example 7");
                double currentPrice = Double.parseDouble(currentPriceValue);
                if (currentPrice > 0) {
                    stock.setCurrentPrice(currentPrice);
                } else {
                    messageDialog("Invalid current price!", "Error", null);
                }
            } catch (NumberFormatException e) {
                messageDialog("Invalid current price!", "Error", null);
            }
        } while (stock.getCurrentPrice() == 0);

        do {
            try {
                previousPriceValue = inputDialog("Write previous price!", "Stock", "It should be a number\nFor example 5");
                double previousPrice = Double.parseDouble(previousPriceValue);
                if (previousPrice > 0) {
                    stock.setPreviousClosingPrice(previousPrice);
                } else {
                    messageDialog("Invalid previous price!", "Error", null);
                }
            } catch (NumberFormatException e) {
                messageDialog("Invalid previous price!", "Error", null);
            }
        } while (stock.getPreviousClosingPrice() == 0);

        String message = String.format("Symbol  %s\nName:  %s\nCurrent Price:  %s\nPrevious Price:  %s\nChanege in precents:  %s", symbol, name, currentPriceValue, previousPriceValue, Double.toString(stock.changePercent()));
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
