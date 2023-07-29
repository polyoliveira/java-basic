package app_mensagens;

import java.util.Scanner;
import app_mensagens.apps.FacebookMessenger;
import app_mensagens.apps.MSNMessenger;
import app_mensagens.apps.ServicoMensagemInstantanea;
import app_mensagens.apps.Telegram;

public class Computador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        ServicoMensagemInstantanea app = null;

        System.out.println("Escolha o app: 1 - Msn | 2 - Facebook | 3 - Telegram");
        int appEscolhido = scanner.nextInt();

        try {
            switch(appEscolhido) {
                case 1: 
                    app = new MSNMessenger();
                    break;
                case 2: 
                    app = new FacebookMessenger();
                    break;
                case 3: 
                    app = new Telegram();
                    break;
                default: 
                    System.out.println("O número precisa ser 1, 2 ou 3");
            }
            
           app.enviarMensagem();
           app.receberMensagem();
           
        } catch(NullPointerException e){
            new NullPointerException();
        }
    }
}
