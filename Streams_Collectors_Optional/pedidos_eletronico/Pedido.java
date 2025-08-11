import java.util.List;
import java.util.Locale;

public class Pedido {

    private int codigo;
    private List<Produto> produtos;
    private Cliente cliente;

    public Pedido(int codigo, List<Produto> produtos, Cliente cliente) {
        this.codigo = codigo;
        this.produtos = produtos;
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
    	return String.format(Locale.getDefault(), "[%d] %s", codigo, cliente.getNome());
    }
}
