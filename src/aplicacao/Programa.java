package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modelo.entidades.Contrato;
import modelo.servicos.ServicoPaypal;
import modelo.servicos.ServicosContrato;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		System.out.println("Entre com os dados do contrato");
		System.out.print("Numero: ");
		int numeroContrato = sc.nextInt();
		System.out.print("Data no formato (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		double valorContrato = sc.nextDouble();
		Contrato contrato = new Contrato(numeroContrato,valorContrato,data);
		
		System.out.print("Numero de parcelas que serao pagas do contrato: ");
		int numeroParcelas = sc.nextInt();
		ServicosContrato servico = new ServicosContrato(numeroParcelas,new ServicoPaypal());
		servico.processamentoContrato(contrato);
		System.out.println("Parcelas");
		for(int i=0;i<contrato.getNumeroParcelas();i++) {
			System.out.println(contrato.getParcela(i));
		}
		sc.close();
	}

}
