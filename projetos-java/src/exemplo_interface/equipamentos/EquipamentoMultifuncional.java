package exemplo_interface.equipamentos;

import exemplo_interface.equipamentos.copiadora.Copiadora;
import exemplo_interface.equipamentos.digitalizadora.Digitalizadora;
import exemplo_interface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("Copiando via equipamento Multifuncional...");
    }

    public void digitalizar() {
          System.out.println("Digitalizando via equipamento Multifuncional...");
    }

    public void imprimir() {
          System.out.println("Imprimindo via equipamento Multifuncional...");

    }
    
}
