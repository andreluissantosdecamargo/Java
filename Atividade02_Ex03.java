package Atividade2;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro entre 1 e 7:");
        int numero = scanner.nextInt();
        
        String diaDaSemana = "";
        
        switch(numero) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda-feira";
                break;
            case 3:
                diaDaSemana = "Terça-feira";
                break;
            case 4:
                diaDaSemana = "Quarta-feira";
                break;
            case 5:
                diaDaSemana = "Quinta-feira";
                break;
            case 6:
                diaDaSemana = "Sexta-feira";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                System.out.println("Número inválido. Por favor, insira um número entre 1 e 7.");
        }
        
        if(!diaDaSemana.isEmpty()) {
            System.out.println("O dia correspondente ao número " + numero + " é " + diaDaSemana + ".");
        }
        
        scanner.close();

	}

}
