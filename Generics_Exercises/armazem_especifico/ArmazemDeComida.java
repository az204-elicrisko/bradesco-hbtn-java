
public class ArmazemDeComida extends Armazem<Comida> implements Armazenavel<Comida> {
    @Override
    public void adicionarAoInventario(String nome, Comida item) {
        super.adicionarAoInventario(nome, item);
    }

    @Override
    public Comida obterDoInventario(String nome) {
        return (Comida) super.obterDoInventario(nome);
    }

}
