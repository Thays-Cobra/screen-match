package desafio4;

public class ConversorTemperaturaPadrao implements  ConversorTemperatura {

    double temperaturaConvertida;

    @Override
    public void celsiusParaFahrenheit(double temperaturaCelsius, double temperaturaFahrenheit) {
        temperaturaConvertida = (temperaturaCelsius * 1.8) + 32;
        System.out.println("Converção de Celsius para Fahrenheit: " + temperaturaConvertida);
    }

    @Override
    public void fahrenheitParaCelsius(double temperaturaCelsius, double temperaturaFahrenheit) {
        temperaturaConvertida = (temperaturaFahrenheit - 32) / 1.8;
        System.out.println("Converção de Fahrenheit para Celsius: " + temperaturaConvertida);
    }
}
