package desafio4;

public class Servico extends Categoria implements Vendavel {

    public static final double DESCONTO = 0.15; // Exemplo de desconto de 15% para serviços


    @Override
    public double precoFinal(int quantidade) {
        return (getPrecoBase() - (getPrecoBase() * DESCONTO)) * quantidade;
    }
}
