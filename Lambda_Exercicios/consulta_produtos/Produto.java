public class Produto {
    private String nome;
    private double preco;
    private double peso;
    private int quantidadeEmEstoque;
    private TiposProduto tipo;

    public Produto(String nome, double preco, double peso, int quantidadeEmEstoque, TiposProduto tipo) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.tipo = tipo;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public TiposProduto getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " " + preco + " " + peso +
                " " + quantidadeEmEstoque + " " + tipo;
    }
}
