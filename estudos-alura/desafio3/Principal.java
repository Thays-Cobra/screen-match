package desafio3;

public class Principal {
    public static void main(String[] args) {

        //Atv 1
        ModeloCarro car = new ModeloCarro();
        car.setModeloCarro("Fusca");
        car.setPrecoAno1(10000);
        car.setPrecoAno2(12000);
        car.setPrecoAno3(15000);
        car.setTipoCambio("Manual");
        car.setTipoCombustivel("Gasolina");
        car.setTipoCarroceria("Hatch");
        car.exibirInfos();

        //Atv 2
        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        //Atv 3
        ContaCorrente conta = new ContaCorrente();
        conta.setSaldo(200);
        conta.depositar(10);
        conta.sacar(50);
        conta.exibirSaldo();
        conta.cobrarTarifaMensal();
        conta.exibirSaldo();

        //Atv 4
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.setNumero(7);
        verificador.verificarPrimalidade();
        verificador.listarPrimos();
        GeradorPrimo gerador = new GeradorPrimo();
        gerador.setNumero(7);
        gerador.gerarProximoPrimo();

    }
}
