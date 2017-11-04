public class Fahrenheit {

    private double fahrenheit;

    public Fahrenheit() {
        setFahrenheit(fahrenheit);
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit=fahrenheit;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public double convertToCelsius() {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }
}
