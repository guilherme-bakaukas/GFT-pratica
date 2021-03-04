package ex2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//aqui adotei que o imposto era sobre o valor inicial da entrada, sem acumular
		
		Scanner entrada = new Scanner(System.in);
		double valor = entrada.nextDouble();
		
		Imposto icms = new ICMS();
		Imposto cofins = new COFINS();
		Imposto ipi = new IPI();
		
		
		
		double icms_value = icms.calculaImposto(valor);
		double ipi_value = ipi.calculaImposto(valor);
		double cofins_value = cofins.calculaImposto(valor);
		
		double somatorio = icms_value + ipi_value + cofins_value;
		
		System.out.println(String.format("ICMS: %.2f", icms_value));
		System.out.println(String.format("IPI: %.2f", ipi_value));
		System.out.println(String.format("COFINS: %.2f", cofins_value));
		
		System.out.println(String.format("Somatório de todos os impostos: %.2f", somatorio ));
		System.out.println(String.format("Somatório de todos os impostos somado ao valor: %.2f", somatorio + valor ));
	}
}
