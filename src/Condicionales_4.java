import java.util.Scanner;

public class Condicionales_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double peso, altura;

        System.out.println("Cual es su peso en kilogramos: ");
        peso = sc.nextDouble();


        System.out.println("Cual es su altura en metros: ");
        altura = sc.nextDouble();

        double indiceMasaCorporal = peso / (altura * altura);

        System.out.printf("Tu indice de masa corporal (IMC) es de: %.2f%n", indiceMasaCorporal);

        if (indiceMasaCorporal < 18.5) {
            System.out.println("Bajo peso");
        } else if (indiceMasaCorporal >= 18.5 && indiceMasaCorporal <24.9){
            System.out.println("Peso normal");
        } else if (indiceMasaCorporal >= 25.0 && indiceMasaCorporal < 29.9) {
            System.out.println("Sobre peso");
        } else {
            System.out.println("Obsesidad");
        }

        }
    }

