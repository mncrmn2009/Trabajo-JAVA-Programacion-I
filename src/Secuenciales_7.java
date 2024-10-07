import java.util.Scanner;

public class Secuenciales_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese su nivel de satisfaccion con la vida (1 - 10): ");
        int satisfaccionVida = sc.nextInt();

        System.out.println("Ingrese su nivel de estres (1 - 10): ");
        int estres = sc.nextInt();

        System.out.println("Ingrese su nivel de salud (1 - 10): ");
        int salud = sc.nextInt();

        double indiceFelicidad = (satisfaccionVida + (10 - estres) + salud) / 3.0;

        System.out.printf("Su indice de felicidad es : %.2f%n", indiceFelicidad);

        if (indiceFelicidad >= 8) {
            System.out.println("Estas feliz!");
        } else if (indiceFelicidad >= 5){
            System.out.println("Tienes una felicidad moderada");
        } else {
            System.out.println("Necesitas mejorar tu felicidad");
        }
    }
}
