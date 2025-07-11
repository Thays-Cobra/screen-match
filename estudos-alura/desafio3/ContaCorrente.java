package desafio3;

public class ContaCorrente extends ContaBancaria {

    public void cobrarTarifaMensal(){
        double tarifa = 17.99;
        double saldo = getSaldo();
        saldo -= tarifa;
        setSaldo(saldo);
    }
}
