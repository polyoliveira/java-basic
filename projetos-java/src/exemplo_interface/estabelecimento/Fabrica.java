package exemplo_interface.estabelecimento;

import exemplo_interface.equipamentos.EquipamentoMultifuncional;
import exemplo_interface.equipamentos.impressora.Deskjet;
import exemplo_interface.equipamentos.impressora.Impressora;
import exemplo_interface.equipamentos.impressora.Laserjet;

public class Fabrica {
    public static void main(String[] args) {
        // Impressora impressora = new Deskjet();
        // Impressora impressora = new Laserjet();
        Impressora impressora = new EquipamentoMultifuncional();
        impressora.imprimir();
    }
}
