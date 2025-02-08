import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a medida em métros: ");
        int medidaMetros = leitor.nextInt();

        int medidaCentrimetros = medidaMetros * 100;

        System.out.println("A medida em centimetros é de: " + medidaCentrimetros);
    }
}