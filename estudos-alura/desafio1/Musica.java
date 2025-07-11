package desafio1;

import java.util.Scanner;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao = 0;
    int numAvaliacoes;

    void technicalSheet(){
        String informations = """
                Título: %s
                Artista: %s
                Ano de Lançamento: %d
                """.formatted(titulo, artista, anoLancamento);
        System.out.println(informations);
    }

    double evaluateMusic() {
        Scanner read = new Scanner(System.in);
        for (numAvaliacoes = 1; numAvaliacoes <= 3; numAvaliacoes++) {
            System.out.println("Digite a nota " + numAvaliacoes + " da música: ");
            double auxAvaliacao = read.nextDouble();
            avaliacao += auxAvaliacao;
        }
        return avaliacao / (numAvaliacoes - 1);
    }
}
