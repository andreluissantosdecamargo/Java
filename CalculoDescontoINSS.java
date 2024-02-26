import java.util.Scanner;

public class CalculoDescontoINSS {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        // Solicita os dados do funcionário
        System.out.print("Digite o salário bruto do funcionário: ");
        double salarioBruto = scanner.nextDouble();

        // Calcula o desconto do INSS (11%)
        double descontoINSS = salarioBruto * 0.11;
        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Desconto INSS (11%): R$" + descontoINSS);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
}