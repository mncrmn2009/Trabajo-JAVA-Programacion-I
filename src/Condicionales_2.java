import java.util.Scanner;

public class Condicionales_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.println("Cual es su categoria? (estudiante, adulto, jubilado): ");
        String categoria = sc.next().toLowerCase();

        switch (categoria) {
            case "estudiante": precio = precio - (precio * 0.1);
                    break;
            case "adulto": precio = precio - (precio * 0.05);
                    break;
            case "jubilado": precio = precio - (precio * 0.15);
                    break;
            default:
                System.out.println("Seleccione una categoria de las mencionadas");
                break;
        }
        System.out.printf("Valor del producto con el descuento es de %.2f%n", precio);
    }
}
