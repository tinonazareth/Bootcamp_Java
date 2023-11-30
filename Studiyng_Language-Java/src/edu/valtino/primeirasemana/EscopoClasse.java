package edu.valtino.primeirasemana;

public class EscopoClasse {
    // variavel da classe escopoClasse
    double saldo = 10.0;
    double novoSaldo;

    public void sacar(double valor){ /*bloco de método a variavel só é acessada neste bloco */
        // variavel local de método
        novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        // disponivel em toda classe
        System.out.println(saldo);
        // somente o método sacar conhece esta variável
        System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial(){
        // variavel local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0; // começando a variável
        for (int x = 1; x <=5; x++) {
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        return valorMontante;

    }
}
