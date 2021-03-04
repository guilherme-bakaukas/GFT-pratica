package ex2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//recebemos o valor pelo terminal
		
		System.out.println("Insira o valor: ");
		Scanner entrada = new Scanner(System.in);
		double valor = entrada.nextDouble();
		
		//instanciamos os objetos das classes e calculamos seus respectivos impostos
		
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
	}
}
