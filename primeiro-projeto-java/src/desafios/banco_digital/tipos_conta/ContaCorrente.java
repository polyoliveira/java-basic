package desafios.banco_digital.tipos_conta;

import desafios.banco_digital.Conta;

public class ContaCorrente extends Conta {
    public void ImprimirExtrato() {
        System.out.println("Extrato cconta poupança:");
        imprimirInformacoesExtrato();
      }
     
}
