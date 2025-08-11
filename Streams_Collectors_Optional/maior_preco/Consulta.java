import java.util.Comparator;
import java.util.List;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido1) {
        return pedido1.getProdutos().stream()
                .filter(produto -> produto.getCategoria() == CategoriaProduto.LIVRO)
                .toList();
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos.stream()
                .sorted(Comparator.comparingDouble(Produto::getPreco).reversed())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Nenhum produto encontrado"));
    }
}
