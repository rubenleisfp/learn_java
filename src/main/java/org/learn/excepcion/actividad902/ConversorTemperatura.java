package org.learn.excepcion.actividad902;

public class ConversorTemperatura {

    public static double convertirACelsius(String valorFahrenheit) throws ValorNoNumericoException {
        try {
            double fahrenheit = Double.parseDouble(valorFahrenheit);
            return (fahrenheit - 32) * 5 / 9;
        } catch (NumberFormatException e) {
            throw new ValorNoNumericoException("El valor '" + valorFahrenheit + "' no es un número válido.");
        }
    }
}
