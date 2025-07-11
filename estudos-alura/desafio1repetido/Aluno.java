package desafio1repetido;

public class Aluno {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibeInformacoea() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }
}
