
public class ArmazemDeEletronico extends Armazem<Eletronico> implements Armazenavel<Eletronico> {

    @Override
    public void adicionarAoInventario(String nome, Eletronico item) {
        super.adicionarAoInventario(nome, item);
    }

    @Override
    public Eletronico obterDoInventario(String nome) {
        return (Eletronico) super.obterDoInventario(nome);
    }

}
