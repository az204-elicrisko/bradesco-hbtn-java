public interface Armazenavel<T> {
    public void adicionarAoInventario(String nome, T obj);
    public T obterDoInventario(String nome);
} 
