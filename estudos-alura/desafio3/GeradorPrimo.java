package desafio3;

public class GeradorPrimo extends NumerosPrimos {

    public void gerarProximoPrimo() {
        int proximoPrimo = getNumero() + 1;
        while (true) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(proximoPrimo); i++) {
                if (proximoPrimo % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("O próximo número primo após " + getNumero() + " é " + proximoPrimo);
                break;
            }
            proximoPrimo++;
        }
    }
}
