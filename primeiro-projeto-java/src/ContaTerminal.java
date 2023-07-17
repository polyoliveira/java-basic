import java.util.Scanner;

public class ContaTerminal {
    int numero_conta;
    String agencia, nome_cliente;
    double saldo;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao Banco do Gigante, digite o seu nome: ");
        String nome_cliente = scanner.next();

        System.out.println("Por favor digite o número da Agência! ");
        String agencia = scanner.next();

        System.out.println("Agora digite o número da conta: ");
        int numero_conta = scanner.nextInt();

        System.out.println("Digite o valor que deseja inserir: ");
        double saldo = scanner.nextDouble();

         System.out.println("Olá "  + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero_conta + " e seu saldo R$" + saldo + " já está disponível.");
    }
}
