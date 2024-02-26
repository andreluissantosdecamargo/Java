import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de n1: ");
		
		float n1 = sc.nextFloat();
		
		System.out.println("Informe o valor de n2: ");
		float n2 = sc.nextFloat();
		
		System.out.println("Informe o valor de n3: ");
		float n3 = sc.nextFloat();
		
		System.out.println("Informe o valor de n4: ");
		float n4 = sc.nextFloat();
		
		// Calcula a média ponderada
		float mediaPonderada = (n1 + 2 * n2 + 3 * n3 + 4 * n4) / 10;
		
		System.out.printf("A média ponderada dos valores %.2f, %.2f, %.2f e %.2f é %.2f%n", n1, n2, n3, n4, mediaPonderada);
		sc.close();
		}
	}