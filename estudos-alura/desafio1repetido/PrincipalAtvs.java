package desafio1repetido;

public class PrincipalAtvs {
    public static void main(String[] args) {
        //1. Crie uma classe Pessoa com um metodo que exibe "Olá, mundo!" no console.
        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        //2. Crie uma classe Calculadora com um metodo que recebe um número como parâmetro e retorna o dobro desse número.
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.dobroDoValor(22));

        //3. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
        Musica musica = new Musica();
        musica.setTitulo("Chihiro");
        musica.setArtista("Billie Eilish");
        musica.setAnoLancamento(2024);
        musica.exibeFichaTecnica();

        musica.avaliaMusica(8);
        musica.avaliaMusica(10.2);
        musica.avaliaMusica(8.5);
        musica.avaliaMusica(9.5);

        System.out.println("Média: " + musica.pegaMedia());

        //4. Crie uma classe Carro com atributos modelo, ano, cor e metodos para exibir a ficha técnica e calcular a idade do carro.
        Carro carro = new Carro();
        carro.setModelo("Hyundai HB20");
        carro.setAno(2022);
        carro.setCor("Branco");
        carro.exibeFichaTecnica();
        System.out.println("Idade: " + carro.idadeDoCarro());

        //5. Crie uma classe Aluno com atributos nome, idade, e um metodo para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o metodo para exibir as informações.
        Aluno aluno = new Aluno();
        aluno.setNome("Thays Cobra");
        aluno.setIdade(26);

        aluno.exibeInformacoea();
    }
}
