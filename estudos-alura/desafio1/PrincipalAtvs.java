package desafio1;

public class PrincipalAtvs {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Thays";
        pessoa.idade = 26;

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);

        pessoa.fazAniversario();

        System.out.println(pessoa.idade);

        Pessoa people = new Pessoa();
        people.helloWorld();

        Calculadora calculator = new Calculadora();
        System.out.println(calculator.doubleNumber(10));

        Musica music = new Musica();
        music.titulo = "As Vantagens de Ser Invisível";
        music.artista = "Logan Lerman";
        music.anoLancamento = 2012;
        music.technicalSheet();
        System.out.printf("\nMédia: %.2f%n", music.evaluateMusic());

        Carro car = new Carro();
        car.modelo = "Hyundai HB20";
        car.ano = 2016;
        car.cor = "Preto";
        car.technicalSheet();
        System.out.println("Idade: " + car.carAge());

        Aluno student = new Aluno();
        student.nome = "Thays Cobra";
        student.idade = 26;
        student.showInformationsStudent();
    }
}
