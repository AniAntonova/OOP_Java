package zad4;

public class Stock {

    private String symbol;

    private String name;

    private double previousClosingPrice;

    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol=symbol;
        this.name=name;
        previousClosingPrice=0;
        currentPrice=0;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double price) {
        this.currentPrice=price;
    }

    public void setPreviousClosingPrice(double price) {
        this.previousClosingPrice = price;
    }

    public double changePercent() {
       return (currentPrice/previousClosingPrice)*100;
    }
}
