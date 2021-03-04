package ex3;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//entrada de dados é realizada pelo terminal e organizada em um vetor de strings
		//posteriormente as strings são convertidas em double(peso e valor) e int(distância) 
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe peso, valor e distância separados por espaço ' ' ");
		System.out.println("Exempo: 'peso valor distância'");
		
		String str_entrada = entrada.nextLine();
		String[] info = str_entrada.split(" ");
		
		//instanciamos carga e adicionamos suas propriedades através dos métodos "set"
		
		Carga carga = new Carga();
		carga.setPeso(Double.parseDouble(info[0]));
		carga.setValor(Double.parseDouble(info[1]));
		int distancia = Integer.parseInt(info[2]);
		
		
		Vagao vagao = new Vagao(carga);
		Caminhao caminhao = new Caminhao(carga);
		
		System.out.println(String.format("Frete vagão: %.2f", vagao.calculaFrete(distancia)));
		System.out.println(String.format("Frete caminhão: %.2f", caminhao.calculaFrete(distancia)));
			
	}

}
