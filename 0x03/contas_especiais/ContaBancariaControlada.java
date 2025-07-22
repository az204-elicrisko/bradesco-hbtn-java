import exceptions.OperacaoInvalidaException;

public class ContaBancariaControlada extends ContaBancariaBasica {
    
    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        double tarifa = calcularTarifaMensal();
        double juros = calcularJurosMensal();
        
        setSaldo(getSaldo() + juros - tarifa); // Atualiza o saldo com juros e tarifas

        // Verifica se o saldo é menor que o saldo mínimo
        if (getSaldo() < saldoMinimo) {
            setSaldo(getSaldo() - valorPenalidade); // Adiciona penalidade se o saldo for inferior ao mínimo
        }
        
    }
}
