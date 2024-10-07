import java.util.Scanner;

public class Condicionales_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un genero de pelicula favorita: accion, comedia, drama, ciencia ficcion");
        String generoPelicula = sc.nextLine().toLowerCase();

        switch (generoPelicula) {
            case "accion":
                System.out.println("John Wick");
                break;
            case "comedia":
                System.out.println("Irene, yo y mi otro yo");
                break;
            case "drama":
                System.out.println("La vida es bella");
                break;
            case "ciencia ficcion":
                System.out.println("Matrix");
                break;
        }
    }
}
