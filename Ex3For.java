package Aula3;

import java.util.Scanner;

public class Ex3For {

	public static void main(String[] args) {
        float nSalario, percentual, perAumento;
        int anoAtual, anoInicial = 2005;
        int cont = 1;
        float salario = 1000;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculo de salário");
        System.out.println("Salário inicial de R$ 1000,00");
        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();

        nSalario = salario;
        percentual = 0.015f;

        for (cont = 2007; cont <= anoAtual; cont++) {
        	
            percentual *= 2;
            perAumento = nSalario * percentual;
            nSalario += perAumento;

        }

        System.out.printf("Seu novo salário será de R$ %.2f", nSalario);
    }

}