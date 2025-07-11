package calculos;

import modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui (Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
