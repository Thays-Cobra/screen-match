package desafio1;

public class Aluno {
    String nome;
    int idade;

    void showInformationsStudent() {
        String information = """
                Nome do aluno: %s
                Idade do aluno: %d
                """.formatted(nome, idade);
        System.out.println(information);
    }
}
