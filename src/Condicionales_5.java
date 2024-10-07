import java.util.Scanner;
import java.util.Random;

public class Condicionales_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random =new Random();

        System.out.println("Elije: piedra, papel o tijera: ");
        String usuario = sc.next().toLowerCase();

        int eleccionPc = random.nextInt(3);
        String pc = sc.nextLine().toLowerCase();

        if (eleccionPc == 0) {
            pc = "piedra";
        } else if (eleccionPc == 1) {
            pc = "papel";
        } else {
            pc = "tijera";
        }

        System.out.println("La computadora eligio: "+ pc);

        if (usuario.equals(pc)) {
            System.out.println("Empate");
        } else if ((usuario.equals("piedra") && pc.equals("tijera")) || (usuario.equals("papel") && pc.equals("piedra")) || (usuario.equals("tijera") && pc.equals("papel"))) {
            System.out.println("Ganaste");
        } else if ((usuario.equals("tijera") && pc.equals("piedra")) || (usuario.equals("papel") && pc.equals("tijera")) || (usuario.equals("piedra") && pc.equals("papel"))) {
            System.out.println("Perdiste");
        } else {
            System.out.println("Opcion no valida");
        }
    }
}
