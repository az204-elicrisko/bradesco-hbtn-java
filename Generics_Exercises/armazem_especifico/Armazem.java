import java.util.Map;

public abstract class Armazem<T> implements Armazenavel<T> {
    private Map<String, T> itens;

    @Override
    public void adicionarAoInventario(String nome, T item) {
        if (itens == null) {
            itens = new java.util.HashMap<>();
        }
        itens.put(nome, item);
    }

    @Override
    public T obterDoInventario(String nome) {
        return itens.get(nome);
    }

}
