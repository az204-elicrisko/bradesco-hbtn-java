public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }
    public double getPercentualDesconto() {
        return percentualDesconto;
    }
    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
    public ItemPedido[] getItens() {
        return itens;
    }   

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }
        return total - (total * percentualDesconto / 100);
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");
        double totalProdutos = 0;
        for (ItemPedido item : itens) {
            String tipo = item.getProduto().getClass().getSimpleName();
            String titulo = item.getProduto().getTitulo();
            double preco = item.getProduto().obterPrecoLiquido();
            int quantidade = item.getQuantidade();
            double totalItem = preco * quantidade;
            totalProdutos += totalItem;
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                tipo, titulo, preco, quantidade, totalItem);
        }
        System.out.println("----------------------------");
        double desconto = totalProdutos * percentualDesconto / 100;
        System.out.printf("DESCONTO: %.2f\n", desconto);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", totalProdutos);
        System.out.println("----------------------------");
        double totalPedido = totalProdutos - desconto;
        System.out.printf("TOTAL PEDIDO: %.2f\n", totalPedido);
        System.out.println("----------------------------");
    }
}
