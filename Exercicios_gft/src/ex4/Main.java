package ex4;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*observações:
		Há a possibilidade de manter maiúsculo apenas o primeiro "incomoda" adicionando um if para a primeira iteração
		no entanto seguindo o exemplo dado, mantive o maiúsculo;
		valores negativos nessa aplicação funcionariam como o valor nulo.
		*/
		
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.print("Incomoda ");
		}
		System.out.println("muito mais");
	}
}

