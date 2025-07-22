import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {

    private int quantidadeTransacoes;

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
        this.quantidadeTransacoes = 0;
    }

    @Override
public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor);
        setSaldo(getSaldo() - 0.10); // Deduz tarifa de depósito
        quantidadeTransacoes++;
    }
    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor);
        setSaldo(getSaldo() - 0.10); // Deduz tarifa de depósito
        quantidadeTransacoes++;
    }
}
