package desafio4;

public class ConversorMoeda implements ConversaoFinanceira {

    private static final double TAXA_CONVERSAO = 5.45; // Exemplo de taxa de conversão

    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        valorEmDolar *= TAXA_CONVERSAO;
        return valorEmDolar;
    }
}
