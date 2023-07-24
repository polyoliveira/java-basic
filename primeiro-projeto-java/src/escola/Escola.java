package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno polyana = new Aluno();
        polyana.setNome("Polyana Sousa");
        polyana.setIdade(21);

        System.out.println("A aluna " + polyana.getNome() + " tem " + polyana.getIdade() + " anos");
    }
}
