package desafio4;

public class Produto2 extends Categoria implements Vendavel {

    public static final double DESCONTO = 0.1; // Exemplo de desconto de 10%

    @Override
    public double precoFinal(int quantidade) {
        return (getPrecoBase() - (getPrecoBase() * DESCONTO)) * quantidade;
    }
}
