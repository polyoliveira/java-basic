package desafios.banco_digital.tipos_conta;

import desafios.banco_digital.Conta;

public class ContaPoupanca extends Conta {
    public void ImprimirExtrato() {
      System.out.println("Extrato conta corrente:");
      imprimirInformacoesExtrato();
    }
}
