package poo;

public abstract class Veiculo {
    private String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Definindo que todo mundo que quiser ser veículo ou seja estender veículo, precisará do método ligar

    //  abstração e polimorfismo
    public abstract void ligar();

}
