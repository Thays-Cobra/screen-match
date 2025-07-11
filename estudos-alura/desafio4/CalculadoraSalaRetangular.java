package desafio4;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.printf("Área da sala retangular: %.2f m²%n", area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.printf("Perímetro da sala retangular: %.2f m%n", perimetro);
    }
}
