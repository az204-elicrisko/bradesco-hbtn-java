public class Program {
    public static void main(String[] args) {
        PersonagemJava personagem1 = new PersonagemJava();

        personagem1.setNome("Sonic");
        personagem1.setSaudeAtual(10);

        System.out.printf("Nome: %s - Saude: %d\n", personagem1.getNome(), personagem1.getSaudeAtual());
    }
}