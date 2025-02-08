import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");
        double lado = leitor.nextDouble();

        double area = lado * lado;

        double dobroArea = 2 * area;

        System.out.println("Área do Quadrado : " + area + " cm ");
        System.out.println("Dobro da área : " + dobroArea + " cm ");
        }
    }
