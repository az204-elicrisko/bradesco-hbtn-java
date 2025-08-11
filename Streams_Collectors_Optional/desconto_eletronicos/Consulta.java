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

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo) {
        return produtos.stream()
                .filter(produto -> produto.getPreco() >= precoMinimo)
                .toList();
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        return pedidos.stream()
            .filter(pedido -> pedido.getProdutos().stream()
                .anyMatch(produto -> produto.getCategoria() == CategoriaProduto.ELETRONICO))
            .toList();
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        return produtos.stream()
            .peek(produto -> {
                if (produto.getCategoria() == CategoriaProduto.ELETRONICO) {
                    produto.setPreco(produto.getPreco() * 0.85);
                }
            })
            .toList();
    }

}
