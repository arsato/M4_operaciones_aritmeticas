import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double resistencia1, resistencia2, resistencia3;

        do {
            System.out.print("Ingrese resistencia 1 (> 0): ");
            resistencia1 = scanner.nextDouble();
        } while (resistencia1 <= 0);

        do {
            System.out.print("Ingrese resistencia 2 (> 0): ");
            resistencia2 = scanner.nextDouble();
        } while (resistencia2 <= 0);

        do {
            System.out.print("Ingrese resistencia 3 (> 0): ");
            resistencia3 = scanner.nextDouble();
        } while (resistencia3 <= 0);

        double resistenciaTotal = 1 / (1/resistencia1 + 1/resistencia2 + 1/resistencia3);

        System.out.println("La resistencia total es de " + resistenciaTotal);
    }
}