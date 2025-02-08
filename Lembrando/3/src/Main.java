import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println();

        System.out.println("Informe o segundo numero");
        int num2 = scanner.nextInt();

        System.out.println();

        Soma soma = new Soma(num1, num2);
        int resultado = soma.getSoma();

        System.out.println("Números informados: " + num1 + " e " + num2);
        System.out.println("A soma de: " + num1 + " e " + num2 +  " é : " + resultado);

    }
}
