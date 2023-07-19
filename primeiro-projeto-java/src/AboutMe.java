import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            // Criando um objeto scanner
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite seu nome: ");
            String nome = scanner.next();
    
            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.next();
    
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
    
            System.out.print("Digite sua altura: ");
            double altura = scanner.nextDouble(); 
    
            System.out.print("Olá, me chamo " + nome + " " + sobrenome + "\r\n");
            System.out.print("Tenho " + idade + " anos" + "\r\n");
            System.out.print("Minha altura é: " + altura);
        } catch(InputMismatchException e) {
             System.out.print("O campo idade deve ser númerico.");
        }
    }
}
