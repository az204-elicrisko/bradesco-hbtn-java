import java.util.List;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido1) {
        return pedido1.getProdutos().stream()
                .filter(produto -> produto.getCategoria() == CategoriaProduto.LIVRO)
                .toList();
    }

}
