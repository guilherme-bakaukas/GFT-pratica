package ex3;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe peso, valor e dist�ncia separados por ;");
		System.out.println("Exempo: 'peso;valor;dist�ncia'");
		
		String str_entrada = entrada.next();
		String[] info = str_entrada.split(";");
		
		Carga carga = new Carga();
		carga.setPeso(Double.parseDouble(info[0]));
		carga.setValor(Double.parseDouble(info[1]));
		int distancia = Integer.parseInt(info[2]);
		
		Vagao vagao = new Vagao(carga);
		Caminhao caminhao = new Caminhao(carga);
		
		System.out.println(String.format("Frete vag�o: %.2f", vagao.calculaFrete(distancia)));
		System.out.println(String.format("Frete caminh�o: %.2f", caminhao.calculaFrete(distancia)));
			
	}

}
