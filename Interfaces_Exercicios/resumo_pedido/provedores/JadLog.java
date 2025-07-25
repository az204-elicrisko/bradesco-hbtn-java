package provedores;

public class JadLog implements ProvedorFrete {

    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();
        if (peso > 2000) {
            frete.setValor(valor * 0.07);
        } else {
            frete.setValor(valor * 0.045);
        }   
        frete.setTipoProvedorFrete(TipoProvedorFrete.JADLOG);
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }

}
