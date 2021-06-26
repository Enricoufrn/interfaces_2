package modelo.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	private Integer numero;
	private Double valorTotal;
	private Date data;
	
	private List<Parcelas> parcelas = new ArrayList<>();

	public Contrato(Integer numero, Double valorTotal, Date data) {
		this.numero = numero;
		this.valorTotal = valorTotal;
		this.data = data;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void adicionarParcela(Parcelas parcela) {
		parcelas.add(parcela);
	}
	
	public void removerParcelas(Parcelas parcela) {
		parcelas.remove(parcela);
	}
	
	public int getNumeroParcelas() {
		return parcelas.size();
	}
	
	public String getParcela(int indice) {
		return String.format("%.2f", parcelas.get(indice).toString());
	}
}
