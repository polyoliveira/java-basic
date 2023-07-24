package desafios;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroParametro;
        int segundoParametro;

        try {
            System.out.print("Digite o primeiro número: ");
            primeiroParametro = scanner.nextInt();
    
            System.out.print("Digite o segundo número: ");
            segundoParametro = scanner.nextInt();

            contar(primeiroParametro, segundoParametro);

        } catch(ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if(primeiroParametro < segundoParametro) {
            int contagem = segundoParametro - primeiroParametro;
            
            for(int x = 1; x <= contagem; x++) {
                System.out.println("Imprimindo o número " + x);
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}
