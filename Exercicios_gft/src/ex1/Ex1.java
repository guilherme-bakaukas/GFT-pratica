package ex1;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float[] vetor = new float[5];
		
		for (int i = 0; i < 5; i++) {
			float num = entrada.nextInt();
			vetor[i] = num;
		}
		
		boolean iguais = true;
		float ant = vetor[0], menor = vetor[0], maior = vetor[0];
		
		for (int i = 0; i<5;i++) {
			
			if(vetor[i]!= ant) {
				iguais = false;
			}
			
			if(vetor[i]<menor) {
				menor = vetor[i];
			}
			
			if (vetor[i]>maior) {
				maior = vetor[i];
			}
		}
		
		System.out.println(String.format("menor: %.3f", menor));
		System.out.println(String.format("maior: %.3f", maior));
		if(iguais) {
			System.out.println("numeros são iguais!");
		}
		
		entrada.close();
		
		
	}

}
