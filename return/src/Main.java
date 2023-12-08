/*
* Recrie a aplicação que calcula a área dos 3 quadriláteros notáveis.
* Agora faça os métodos retornarem valores.
* */
public class Main {
    public static void main(String[] args) {
        System.out.println("Retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadradro: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d,5d);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}