package exercicio;

public class Main {
    public static void main(String[] args) {
        Veiculo meuVeiculo = new Veiculo(2023, "Toyota", 15.0, 50.0);
        meuVeiculo.ligar();
        meuVeiculo.viajar(100);
        meuVeiculo.revisao();
        meuVeiculo.desligar();
        
    
       
    }
}