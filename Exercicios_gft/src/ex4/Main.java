package ex4;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*observa��es:
		H� a possibilidade de manter mai�sculo apenas o primeiro "incomoda" adicionando um if para a primeira itera��o
		no entanto seguindo o exemplo dado, mantive o mai�sculo;
		valores negativos nessa aplica��o funcionariam como o valor nulo.
		*/
		
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.print("Incomoda ");
		}
		System.out.println("muito mais");
	}
}

