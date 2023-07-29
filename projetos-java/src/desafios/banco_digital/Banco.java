package desafios.banco_digital;

import desafios.banco_digital.tipos_conta.ContaCorrente;
import desafios.banco_digital.tipos_conta.ContaPoupanca;

public class Banco {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao banco Gigante da Colina!" + "\n\r");

        Conta conta_corrente = new ContaCorrente();
        Conta conta_poupanca = new ContaPoupanca();

        conta_corrente.depositar(500);
        conta_corrente.transferir(400, conta_poupanca);
        conta_poupanca.sacar(200);
        conta_corrente.ImprimirExtrato();
        conta_poupanca.ImprimirExtrato();        
    }
}
