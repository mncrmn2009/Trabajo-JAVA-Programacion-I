import java.util.Scanner;

public class Condicionales_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque su genero de libro favorito (fantasia, misterio, romance, ciencia ficcion): ");
        String genero = sc.nextLine().toLowerCase();

        switch (genero){
            case "fantasia":
                System.out.println("Te recomiendo Alas de Sangre");
                break;
            case "misterio":
                System.out.println("Te recomiendo La pareja de al lado");
                break;
            case "romance":
                System.out.println("Te recomiendo El amor de los tiempos del colera");
                break;
            case "ciencia ficcion":
                System.out.println("Te recomiendo Dune");
                break;
            default:
                System.out.println("Genero no mencionado anteriormente. Seleccione uno de los mencionados");
                break;
        }
    }
}
