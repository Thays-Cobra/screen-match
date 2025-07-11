package desafio4;

public class App {
    public static void main(String[] args) {
        //1. Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o metodo converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

        ConversaoFinanceira conversor = new ConversorMoeda();
        double valorEmDolar = 100.0; // Exemplo de valor em dólar
        double valorEmReal = conversor.converterDolarParaReal(valorEmDolar);

        System.out.printf("Valor em Dólar: %.2f%n", valorEmDolar);
        System.out.printf("Valor convertido em Real: %.2f%n", valorEmReal);


        //2. Crie uma classe CalculadoraSalaRetangular que implementa a interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber a altura e a largura da sala como parâmetros.

        CalculoGeometrico calculadora = new CalculadoraSalaRetangular();
        double altura = 5.0; // Exemplo de altura da sala
        double largura = 4.0; // Exemplo de largura da sala
        calculadora.calcularArea(altura, largura);
        calculadora.calcularPerimetro(altura, largura);

        //3. Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o metodo mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.

        Tabuada tabuada = new TabuadaMultiplicacao();
        int numero = 7; // Exemplo de número para a tabuada
        System.out.println("Tabuada do " + numero + ":");
        tabuada.mostrarTabuada(numero);

        //4. Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
        ConversorTemperatura conversorTemperatura = new ConversorTemperaturaPadrao();
        double temperaturaCelsius = 25.0; // Exemplo de temperatura em Celsius
        double temperaturaFahrenheit = 77.0; // Exemplo de temperatura em Fahrenheit
        conversorTemperatura.celsiusParaFahrenheit(temperaturaCelsius, temperaturaFahrenheit);
        conversorTemperatura.fahrenheitParaCelsius(temperaturaCelsius, temperaturaFahrenheit);

        //5. Crie uma interface Calculavel com um metodo double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
        Produto livro = new Livro();
        livro.setPrecoBase(50.0); // Exemplo de preço base do livro
        double precoFinalLivro = ((Calculavel) livro).calcularPrecoFinal();
        System.out.printf("Preço final do livro: %.2f%n", precoFinalLivro);
        Produto produtoFisico = new ProdutoFisico();
        produtoFisico.setPrecoBase(100.0); // Exemplo de preço base do produto físico
        double precoFinalProdutoFisico = ((Calculavel) produtoFisico).calcularPrecoFinal();
        System.out.printf("Preço final do produto físico: %.2f%n", precoFinalProdutoFisico);

        //6. Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.
        Categoria produto2 = new Produto2();
        produto2.setPrecoBase(30.0); // Exemplo de preço base do produto
        int quantidade = 3; // Exemplo de quantidade comprada
        double precoFinalProduto2 = ((Vendavel) produto2).precoFinal(quantidade);
        System.out.printf("Preço final do produto 2 para %d unidades: %.2f%n", quantidade, precoFinalProduto2);

        Categoria servico = new Servico();
        servico.setPrecoBase(80.0); // Exemplo de preço base do serviço
        double precoFinalServico = ((Vendavel) servico).precoFinal(quantidade);
        System.out.printf("Preço final do serviço para %d unidades: %.2f%n", quantidade, precoFinalServico);
    }
}
