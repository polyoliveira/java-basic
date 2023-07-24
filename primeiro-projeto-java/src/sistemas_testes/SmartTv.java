package sistemas_testes;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.print("Sua Tv agora está ligada!" + "\r\n");  
    }

    public void desligar() {
        System.out.print("Sua Tv foi desligada." + "\r\n"); 
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.print("Volume atual: " + volume + "\r\n"); 
    }

    public void diminuirVolume() {
        volume--;
        System.out.print("Volume atual: " + volume + "\r\n");
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.print("Canal atual: " + canal + "\r\n");
    }

    public void aumentarCanal() {
        canal++;
         System.out.print("Canal atual: " + canal + "\r\n");
    }

    public void diminirCanal() {
        canal--;
         System.out.print("Canal atual: " + canal + "\r\n");
    }
}
