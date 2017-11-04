/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author dzhel
 */
public class Celsius {
    private double celsius;
    public double getCelsius()
    {return celsius;}
    public void setCelsius(double cel)
    { celsius=cel;}
    double convertToFahrenheit()
    {
        return 9.0/5.0*celsius+32;
    }
    
}
