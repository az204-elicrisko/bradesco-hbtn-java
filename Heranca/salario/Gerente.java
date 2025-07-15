public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    public double calcularBonus(Departamento departamentoEngenharia) {
        if (departamentoEngenharia.alcancouMeta()) {
            return this.getSalarioFixo() * 0.2 + (departamentoEngenharia.getValorAtingidoMeta()-departamentoEngenharia.getValorMeta()) * 0.01; // 20% de bonus para gerente + 1%
        } else {
            return 0; // sem bonus
        }
    }

}
