package modelo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {
	private Date dataPagamento;
	private Double valor;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Parcelas(Date dataPagamento, Double valor) {
		this.dataPagamento = dataPagamento;
		this.valor = valor;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return sdf.format(dataPagamento)+" - "+valor;
	}
}
