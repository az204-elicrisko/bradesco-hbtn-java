import java.util.function.Supplier;
import java.util.function.Consumer;

public class Produto {

    private String nome;
    private double preco;
    private double percentualMarkup;
    public Supplier<Double> precoComMarkup = () -> {
        return preco + (preco * percentualMarkup);
    };
    public Consumer<Double> atualizarMarkup = (novoPercentual) -> {
        this.percentualMarkup = novoPercentual/100;
    };

    public Produto(double d, String string) {
        this.nome = string;
        this.preco = d;
        this.percentualMarkup = 0.1; // Valor padrão de 10%
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
