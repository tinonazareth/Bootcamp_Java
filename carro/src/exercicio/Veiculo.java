package exercicio;

public class Veiculo {
    boolean ligado;
    int ano;
    String marca;
    double kmRodados;
    double consumo;
    double tanqueAtual;

    public Veiculo(int ano, String marca, double consumo, double tanqueAtual) {
        this.ano = ano;
        this.marca = marca;
        this.consumo = consumo;
        this.tanqueAtual = tanqueAtual;
        this.ligado = false;
        this.kmRodados = 0;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void viajar(double km) {
        if (this.ligado) {
            double gasto = km / this.consumo;
            if (this.tanqueAtual >= gasto) {
                this.tanqueAtual -= gasto;
                this.kmRodados += km;
            } else {
                System.out.println("Combustível insuficiente para a viagem.");
            }
        } else {
            System.out.println("O veículo está desligado.");
        }
    }

    public void revisao() {
        this.consumo *= 1.1;
    }
}