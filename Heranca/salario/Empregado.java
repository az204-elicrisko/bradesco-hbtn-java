public class Empregado {

    private double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double calcularSalarioTotal(Departamento departamentoEngenharia) {
        if (departamentoEngenharia.alcancouMeta()) {
            return salarioFixo + calcularBonus(departamentoEngenharia);
        } else {
            return salarioFixo; // sem bonus
        }
    }

    public double calcularBonus(Departamento departamentoEngenharia) {
        if (departamentoEngenharia.alcancouMeta()) {
            return salarioFixo * 0.1; // 10% de bonus
        } else {
            return 0; // sem bonus
        }
    }

}
