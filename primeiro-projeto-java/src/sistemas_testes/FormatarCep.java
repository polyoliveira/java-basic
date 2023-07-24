package sistemas_testes;

public class FormatarCep {
    public static void main(String[] args) {
        try {
            String cepUsuario = formatarCep("23754896");
        } catch(CepInvalidoException e) { 
            System.out.println("O cep não está formatado do jeito correto. Insira da seguinte forma: 23.781-547");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return cep;
    }
}
