import java.util.Scanner;

public class Condicionales_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas horas al dia duermes?: ");
        int horasDormir = sc.nextInt();

        System.out.println("Cuantas horas al dia haces ejercicio?: ");
        int horasEjercicio = sc.nextInt();

        System.out.println("Cuantas comidas saludables consumes al dia?: ");
        int comidas = sc.nextInt();

        System.out.println("La evaluacion de tus habitos saludables es: ");

        if (horasDormir < 7) {
            System.out.println("- Necesitas dormir mas. Se recomienda dormir entre 7 y 9 horas.");
        } else if (horasDormir > 9) {
            System.out.println("- Estas durmiendo demasiado. Se recomienda dormir entre 7 y 9 horas");
        } else {
            System.out.println("- Tus horas de sueño son adecuadas.");
        }

        if (horasEjercicio < 1) {
            System.out.println("- Necesitas hacer mas ejercicio. Se recomienda hacer al menos una hora al dia.");
        } else if (horasEjercicio >2) {
            System.out.println("- Haces mucho ejercicio. Se recomienda hacer al menos una o dos horas al dia");
        } else {
            System.out.println("- Tu nivel de ejercicio es adecuado.");
        }

        if (comidas < 3){
            System.out.println("- Deberias comer mas comidas saludables. Se recomienda al menos 3 al dia.");
        } else if (comidas > 5) {
            System.out.println("- Estas consumiendo mas de las recomendadas. Se recomienda entre 3 y 5 al dia");
        } else {
            System.out.println("- Tu consumo de comidas saludables es adecuado.");
        }
    }
}
