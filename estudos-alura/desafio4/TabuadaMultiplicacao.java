package desafio4;

public class TabuadaMultiplicacao implements  Tabuada {

    private int limite = 10;

    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= limite; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
