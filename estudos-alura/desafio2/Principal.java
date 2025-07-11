package desafio2;

public class Principal {
    public static void main(String[] args) {
        //1. Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.
        ContaBancaria account = new ContaBancaria();
        account.setNumeroConta(1017349);
        account.setSaldo(2100.89);
        account.titular = "Fábio Nascimento";
        System.out.println("Número da conta: " + account.getNumeroConta());
        System.out.println("Saldo: " + account.getSaldo());
        System.out.println("Titular: " + account.titular);

        //2. Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um metodo verificarIdade que imprime se a pessoa é maior de idade ou não.
        IdadePessoa age = new IdadePessoa();
        age.setNome("Carla Dias");
        age.setIdade(19);
        System.out.println("Nome: " + age.getNome());
        System.out.println("Idade: " + age.getIdade());
        age.verificarIdade();

        //3. Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um metodo aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
        Produto product1 = new Produto();
        product1.setNome("Escova de dentes");
        product1.setPreco(2.39);

        Produto product2 = new Produto();
        product2.setNome("Iogurte Natural");
        product2.setPreco(3.49);

        System.out.println("\nProduto: " + product1.getNome() + "\nValor Total: R$ " + product1.getPreco() + "\nValor c/ Desconto: R$ " + product1.aplicarDesconto(10));
        System.out.println("Produto: " + product2.getNome() + "\nValor Total: R$ " + product2.getPreco() + "\nValor c/ Desconto: R$ " + product2.aplicarDesconto(30));

        //4. Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um metodo calcularMedia que retorna a média das notas do aluno.
        Aluno student1 = new Aluno();
        student1.setNome("Kristina Aguilera");
        student1.setNota1(10);
        student1.setNota2(8);
        student1.setNota3(7);
        System.out.println("\nNome: " + student1.getNome() + "\nMédia: " + student1.calcularMedia());

        //5. Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um metodo exibirDetalhes que imprime o título e o autor do livro.
        Livro book1 = new Livro();
        book1.setTitulo("Bem-vindos à livraria Hyunam-dong");
        book1.setAutor("Hwang Bo-Reum\n");
        book1.exibirDetalhes();
    }
}
