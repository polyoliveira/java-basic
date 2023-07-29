package poo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        Moto z400 = new Moto();

        jeep.ligar();
        z400.ligar();
        jeep.setPlaca("848535");
        z400.setPlaca("847765");

        System.out.println("O jeep tem a placa " + jeep.getPlaca() + " e a moto tem a placa " + z400.getPlaca());
    }
}
