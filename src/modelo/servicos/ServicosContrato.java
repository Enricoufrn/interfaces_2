package modelo.servicos;

import java.util.Calendar;
import java.util.Date;

import modelo.entidades.Contrato;
import modelo.entidades.Parcelas;

public class ServicosContrato {
	private int numeroParcelas = 1;
	private ServicoPagamentoOnline servicoOnline;
	
	public ServicosContrato(int numeroParcelas, ServicoPagamentoOnline servicoOnline) {
		this.servicoOnline = servicoOnline;
		this.numeroParcelas = numeroParcelas;
	}
	public void processamentoContrato(Contrato contrato) {
		Date dataContrato = contrato.getData();
		Calendar cal = Calendar.getInstance();
		Date aux = dataContrato;
		double valorParcial;
		double valorParcelaBruto = contrato.getValorTotal()/numeroParcelas;
		for(int i=1;i<=numeroParcelas;i++) {
			cal.setTime(aux);
			cal.add(Calendar.MONTH,(i));
			valorParcial=valorParcelaBruto+valorParcelaBruto*servicoOnline.getJuroMensal()*i;
			valorParcial+=valorParcial*servicoOnline.getTaxaPagamento();
			contrato.adicionarParcela(new Parcelas(cal.getTime(),valorParcial));
		}
	}
}
