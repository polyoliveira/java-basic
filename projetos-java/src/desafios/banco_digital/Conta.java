package desafios.banco_digital;

public abstract class Conta {
    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 0001;

    protected int agencia;
    protected int numero_conta;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero_conta = SEQUENCIAL++;
    } 

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        saldo =  saldo - valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    
    public abstract void ImprimirExtrato();

    protected void imprimirInformacoesExtrato() {
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numero_conta);
        System.out.println("Saldo bancário: " + saldo + "\n\r");
    }

    public int getAgencia() { 
        return agencia; 
    }
    public int getConta() {
        return numero_conta;
    }
    public double getSaldo() {
        return saldo;
    }
}
