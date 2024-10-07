import java.util.Scanner;

public class Secuenciales_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita el peso en kilogramos
        System.out.println("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        //Solicita el tiempo del ejercicio en min
        System.out.println("Ingrese la duracion del ejercicio en minutos: ");
        double duracion = scanner.nextDouble();

        //Solicita el tipo del ejercicio
        System.out.println("Ingrese el tipo de ejercicio (correr, nadar, andar en bicicleta");
        String tipoEjercicio = scanner.next().toLowerCase();

        double caloriasPorMinuto = 0;

        // Determinar la tasa de calorias quemadas segun el tipo de ejercicio
        if (tipoEjercicio.equals("correr")) {
            caloriasPorMinuto = 12; //calorias quemadas por minuto
        } else if (tipoEjercicio.equals("nadar")) {
            caloriasPorMinuto = 8;
        } else if (tipoEjercicio.equals("andar en bicicleta")) {
            caloriasPorMinuto = 6;
        } else {
            System.out.println("Ejercicio no valido.");
        }

        //Calcular las calorias quemadas
        double caloriasQuemadas = caloriasPorMinuto * duracion * peso / 60;

        //Imprimir el resultado
        System.out.printf("Calorias quemadas: %.2f%n", caloriasQuemadas);
    }
}
