package javaLang;

public class TestaInteger {
    public static void main(String[] args) {
        // CONSTRUTOR Integer TA DEPRECIADO
        Integer x1 = Integer.valueOf(10);
        Integer x2 = Integer.valueOf(10);

        if (x1 == x2) {
            System.out.println("igual");
        } else {
            System.out.println("diferente");
        }

        if (x1.equals(x2)) {
            System.out.println("igual");
        } else {
            System.out.println("diferente");
        }

        String hello = "Hello World";
        int hello2 = 22;
        Integer testeInteger = Integer.parseInt(hello);
        Integer testeInteger2 = Integer.parseInt(String.valueOf(hello2));
        System.out.println(testeInteger); // Isso vai lançar uma exceção NumberFormatException, pois "Hello World" não é um número válido.
        System.out.println(testeInteger2);
    }
}
