package poo;

public class Carro extends Veiculo {
    public void ligar() {
        conferirCombustivel();
        conferirCambio();
        System.out.println("Carro ligado!!");
    }

    private void conferirCombustivel() {
        System.out.println("Verificando combustível...");
    }

    private void conferirCambio() {
         System.out.println("Conferindo câmbio em P");
    }
}
