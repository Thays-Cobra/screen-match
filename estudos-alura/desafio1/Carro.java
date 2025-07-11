package desafio1;

import java.util.Calendar;

public class Carro {

    String modelo;
    int ano;
    String cor;

    void technicalSheet() {
        String informations = """
                Modelo: %s
                Ano: %d
                Cor: %s
                """.formatted(modelo, ano, cor);
        System.out.print(informations);
    }

    int carAge() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        return year - ano;
    }
}
