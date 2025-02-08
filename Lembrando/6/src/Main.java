import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o raio do círculo: ");
        double raio = leitor.nextDouble();

        double Circuloarea = 3.14 * (raio * raio);

        System.out.println("O circulo com o raio de : " + raio + " cm " + ", tem a área de: " + Circuloarea);

    }
}