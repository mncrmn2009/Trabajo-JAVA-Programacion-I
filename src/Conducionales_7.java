import java.util.Scanner;

public class Conducionales_7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Cual es tu estado de animo actualmente (feliz, triste, energico, relajado): ");
        String estadoAnimo = sc.nextLine().toLowerCase();

        switch (estadoAnimo){
            case "feliz":
                System.out.println("Disfruta con amigos!");
                break;
            case "triste":
                System.out.println("Ve una pelicula divertida o da un paseo");
                break;
            case "energico":
                System.out.println("Has un poco de ejercicio");
                break;
            case "relajado":
                System.out.println("Lee un libro o meditar");
                break;
            default:
                System.out.println("El estado de animo no esta entre las opciones");
                break;
        }
    }
}
