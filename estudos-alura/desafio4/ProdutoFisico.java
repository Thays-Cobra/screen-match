package desafio4;

public class ProdutoFisico extends Produto implements Calculavel {

    private static final double TAXA_ADICIONAL = 0.05; // Exemplo de taxa adicional para produtos físicos

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + (getPrecoBase() * TAXA_ADICIONAL);
    }
}
