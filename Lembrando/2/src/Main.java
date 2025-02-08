import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe um número inteiro: ");

        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();

        System.out.println("O numero informado foi: ");
        System.out.println(numero);
    }
}
