package desafio3;

public class ModeloCarro extends Carro {
    private String tipoCombustivel;
    private String tipoCambio;
    private String tipoCarroceria;

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Tipo de Câmbio: " + tipoCambio);
        System.out.println("Tipo de Carroceria: " + tipoCarroceria);
    }
}
