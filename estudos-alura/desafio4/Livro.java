package desafio4;

import lombok.Data;

@Data
public class Livro extends Produto implements Calculavel {

    public static final double DESCONTO = 0.1; // Exemplo de desconto de 10%

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() - (getPrecoBase() * DESCONTO);
    }
}
