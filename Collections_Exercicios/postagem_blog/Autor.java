public class Autor implements Comparable<Autor> {
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome)  {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }
    @Override
    public int compareTo(Autor o) {
        return this.nome.compareTo(o.nome) != 0 ? this.nome.compareTo(o.nome)
                : this.sobrenome.compareTo(o.sobrenome);
    }
}
