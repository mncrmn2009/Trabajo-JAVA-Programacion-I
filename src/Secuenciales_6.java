import java.util.Scanner;

public class Secuenciales_6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("¿Cuantas horas puedes estudiar por dia? ");
        int horasDiarias = sc.nextInt();

        int horasTotales = horasDiarias *7; //Dias de la semana

        String [] materias = {"Programacion", "Arquitectura", "Organizacion Empresarial", "Matematica"};
        int [] horasPorMateria = new int[materias.length];

        int horasPorMateriaBase = horasTotales / materias.length;
        for (int i = 0; i < materias.length; i++) {
            horasPorMateria[i] = horasPorMateriaBase;
        }
        int horasRestantes = horasTotales % materias.length;

        //Asigna horas restantes a las primeras materias
            for (int i = 0; i < horasRestantes; i++) {
                horasPorMateria[i]++;
            }
        System.out.println("\nPlan de estudio semanal:");
            for (int i=0;i<materias.length;i++) {
            System.out.println(materias [i]+": "+ horasPorMateria[i] + " horas");

        }
    }
}
