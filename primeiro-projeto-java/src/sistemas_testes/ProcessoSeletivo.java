package sistemas_testes;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoDosCandidatos();
        imprimirCandidatosSelecionados();
    }

    static void selecaoDosCandidatos() {
        String [] candidatos = {"Polyana", "Maria", "Renam", "Vitor", "Elionai", "Thiago", "Fernando", "Leonor", "Nathália", "Gabriel"};

        int candidatoSelecionado = 0;
        int indiceArray = 0;

        while(candidatoSelecionado < 5 && indiceArray < candidatos.length) { 
            String candidato = candidatos[indiceArray];
            double salarioBase = 2000.0;
            double salarioPretendido = valorPretendido();

            System.out.println("O candidado: " + candidato + " solicitou o valor R$" + salarioPretendido + "\r\n") ;

            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidado(a) " + candidato + " foi selecionado(a) para a vaga" + "\r\n");
                candidatoSelecionado++;
            }
            indiceArray++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2250);
    }

    static void analisarCandidatos(double salarioPretendido) {
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido) {
             System.out.print("Ligar para o candidato.");
        } else if(salarioBase == salarioPretendido) {
            System.out.print("Ligar para o candidato com contra proposta.");
        } else {
             System.out.print("Aguardando demais candidatos....");
        }
    }

    static void imprimirCandidatosSelecionados() {
        String [] candidatos = {"Polyana", "Maria", "Renam", "Vitor", "Elionai"};  

        for(String candidato : candidatos) {
            System.out.println("O candidado selecionado foi: " + candidato);
        }
    }
}
