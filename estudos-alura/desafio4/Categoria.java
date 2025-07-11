package desafio4;

import lombok.Data;

@Data
public class Categoria {
    private String nome;
    private String descricao;
    private int quantidade;
    private double precoBase;
}
