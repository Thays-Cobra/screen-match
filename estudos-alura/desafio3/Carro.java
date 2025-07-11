package desafio3;

public class Carro {

    private String modeloCarro;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }

    public void exibirInfos () {
        System.out.println("Modelo: " + modeloCarro);
        System.out.println("Preço Ano 1: " + precoAno1);
        System.out.println("Preço Ano 2: " + precoAno2);
        System.out.println("Preço Ano 3: " + precoAno3);
        System.out.println("Menor Preço: " + calcularMenorPreco());
        System.out.println("Maior Preço: " + calcularMaiorPreco());
    }

    private double calcularMaiorPreco() {
        double maiorPreco = 0;
        if ((precoAno1 > precoAno2) && (precoAno1 > precoAno3)) {
            maiorPreco = precoAno1;
        }
        if ((precoAno2 > precoAno1) && (precoAno2 > precoAno3)) {
            maiorPreco = precoAno2;
        }
        if ((precoAno3 > precoAno1) && (precoAno3 > precoAno2)) {
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    private double calcularMenorPreco() {
        double menorPreco = 0;
        if ((precoAno1 < precoAno2) && (precoAno1 < precoAno3)) {
            menorPreco = precoAno1;
        }
        if ((precoAno2 < precoAno1) && (precoAno2 < precoAno3)) {
            menorPreco = precoAno2;
        }
        if ((precoAno3 < precoAno1) && (precoAno3 < precoAno2)) {
            menorPreco = precoAno3;
        }
        return menorPreco;
    }
}
