import java.util.Scanner;

public class Secuenciales_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la distancia del viaje
        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        // Solicitar el consumo de combustible del vehículo
        System.out.print("Ingrese el consumo de combustible del vehículo (litros por kilómetro): ");
        double consumoPorKilometro = scanner.nextDouble();

        // Solicitar el precio del combustible por litro
        System.out.print("Ingrese el precio del combustible por litro: ");
        double precioPorLitro = scanner.nextDouble();

        // Calcular el total de litros necesarios
        double totalLitros = distancia * consumoPorKilometro;

        // Calcular el costo total del viaje
        double costoTotal = totalLitros * precioPorLitro;

        // Imprimir el costo total del viaje
        System.out.printf("El costo total del viaje es: %.2f\n", costoTotal);
    }
}
