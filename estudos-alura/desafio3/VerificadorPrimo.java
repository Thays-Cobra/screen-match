package desafio3;

public class VerificadorPrimo extends NumerosPrimos {
    public void verificarSeEhPrimo() {
        if (getNumero() < 2) {
            System.out.println("O número " + getNumero() + " não é primo.");
            return;
        }

        for (int i = 2; i <= Math.sqrt(getNumero()); i++) {
            if (getNumero() % i == 0) {
                System.out.println("O número " + getNumero() + " não é primo.");
                return;
            }
        }

        System.out.println("O número " + getNumero() + " é primo.");
    }
}
