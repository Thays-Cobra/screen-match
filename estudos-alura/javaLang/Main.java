package javaLang;

public class Main {
    public static void main(String[] args) {

        String s = "fj11";
        String v = s.replaceAll("1", "2");
        System.out.println(v);

        String s1 = "fj11";
        String s2 = "fj11";
        System.out.println(s1.contains(s2)); // true, porque ambos apontam para o mesmo objeto na pool de strings

        String s3 = "fj11   ";
        System.out.println(s3.trim()); // "fj11", remove espaços em branco no início e no final
        System.out.println(s3.isEmpty()); // false, porque a string não está vazia
        System.out.println(s3.length()); // 5, conta os caracteres incluindo espaços

        String texto = "java é show";
        char letra = texto.charAt(3);
        System.out.println(letra); // 'a', retorna o caractere na posição 3 (começando do 0)
        String invertida = new StringBuilder(texto).reverse().toString();
        System.out.println(invertida); // "avaj", inverte a string usando StringBuilder
        String[] palavras = texto.split(" ");
        for (int i = palavras.length - 1; i >= 0; i--) {
            System.out.print(palavras[i] + " ");
        }
        System.out.println("");

    }
}
