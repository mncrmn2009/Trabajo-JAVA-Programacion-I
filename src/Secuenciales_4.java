import java.util.Scanner;

public class Secuenciales_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Se solicita el estado de animo
        System.out.println("Escriba su estado de animo: feliz, triste, energico, relajado");
        String estadoAnimo = sc.nextLine().toLowerCase();

        String cancion = "";

        switch (estadoAnimo) {
            case "feliz": cancion += "Happy - Pharrell Williams";
                break;
            case "triste": cancion += "Someone Like You - Adele";
                break;
            case "energico": cancion += "Thunder - Imagine Dragons";
                break;
            case "relajado": cancion += "Ocean Eyes - Billie Eilish";
                break;
            default: System.out.println("Estado de animo no reconocido");
        }

        System.out.println("Lista de reproduccion sugerida segun su estado de animo " + estadoAnimo + " es: \n"+ cancion);
    }
}
