package desafio1repetido;

import java.util.Calendar;

public class Carro {

    private String modelo;
    private int ano;
    private String cor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void exibeFichaTecnica() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de lançamento: " + getAno());
        System.out.println("Cor: " + getCor());
    }

    public int idadeDoCarro () {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        return year - getAno();
    }
}
