package desafios.desafio_iphone;

import desafios.desafio_iphone.iphone_funcoes.aparelho_telefonico.AparelhoTelefonico;
import desafios.desafio_iphone.iphone_funcoes.navegador.Navegador;
import desafios.desafio_iphone.iphone_funcoes.reprodutor_musical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        iphone.selecionarMusica();
        iphone.tocar();
    }

    public void exibirPagina() {
        System.out.println("Exibindo página com Iphone..");
    }
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página....");
        
    }

    public void ligar() {
        System.out.println("Ligando...");
    }
    public void atender() {
        System.out.println("Atendendo...");
        
    }
    public void IniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    public void tocar() {
        System.out.println("Tocando música...");  
    }  
    public void pausar() {
        System.out.println("Pausando música...");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }
    
}
