package desafio3;

public class NumerosPrimos {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void verificarPrimalidade() {
        if (numero < 2) {
            System.out.println("O número " + numero + " não é primo.");
            return;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                System.out.println("O número " + numero + " não é primo.");
                return;
            }
        }

        System.out.println("O número " + numero + " é primo.");
    }
        public void listarPrimos() {
            System.out.println("Números primos até " + numero + ":");
            for (int i = 2; i <= numero; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
