package modelo.servicos;

public class ServicoPaypal implements ServicoPagamentoOnline{
	private static final Double juroMensal = 0.01;
	private static final Double taxaPagamento = 0.02;

	public Double getJuroMensal() {
		return juroMensal;
	}

	public Double getTaxaPagamento() {
		return taxaPagamento;
	}
}
