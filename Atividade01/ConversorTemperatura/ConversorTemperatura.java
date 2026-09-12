package ConversorTemperatura;

public class ConversorTemperatura {
    public static final Double KELVIN_OFFSET = 273.15;

    public static Double celsiusParaFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
    public static Double fahrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }

    public static class TesteConversor{
        public static void main(String[] args){
            double rCelsius = fahrenheitParaCelsius(80);
            double rFahrenheit = celsiusParaFahrenheit(100);

            System.out.println("Fahrenheit para Celsius: " + rCelsius);
            System.out.println("Celsius para Fahrenheit: " + rFahrenheit);
        }
    }
}
