import java.util.Scanner;

public class Secuenciales_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nivel de condicion ficica del usuario
        System.out.println("Escribe tu nivel de condicion fisica: principiante, intermedio, avanzado");
        String condicionFisica = sc.nextLine().toLowerCase();

        //Variable para guardar la rutina
        String rutina = "";

        //Generar la rutina segun la condicion
        if (condicionFisica.equals("principiante")) {
            rutina += "Lunes: Caminata ligera - 30 minutos \n";
            rutina += "Martes: Yoga - 30 minutos \n";
            rutina += "Miercoles: DESCANSO \n";
            rutina += "Jueves: Ejercicios de fuerza con el peso corporal - 20 minutos \n";
            rutina += "Viernes: Caminata ligera - 30 minutos \n";
            rutina += "Sabado: Ejercicio de estiramiento - 20 minutos";
            rutina += "Domingo: DESCANSO \n";
        } else if (condicionFisica.equals("intermedio")) {
            rutina += "Lunes: Correr - 30 minutos\n";
            rutina += "Martes: Circuito de fuerza - 30 minutos\n";
            rutina += "Miércoles: Descanso activo (caminata o yoga) - 20 minutos\n";
            rutina += "Jueves: Entrenamiento de HIIT - 25 minutos\n";
            rutina += "Viernes: Natación - 30 minutos\n";
            rutina += "Sábado: Ciclismo - 40 minutos\n";
            rutina += "Domingo: Descanso\n";
        } else if (condicionFisica.equals("avanzado")) {
            rutina += "Lunes: Correr - 45 minutos\n";
            rutina += "Martes: Entrenamiento de fuerza (pesas) - 60 minutos\n";
            rutina += "Miércoles: Yoga o pilates - 30 minutos\n";
            rutina += "Jueves: HIIT - 30 minutos\n";
            rutina += "Viernes: Natación intensa - 45 minutos\n";
            rutina += "Sábado: Ciclismo de montaña - 60 minutos\n";
            rutina += "Domingo: Descanso o estiramientos - 30 minutos\n";
        } else {
            rutina = "Nivel de condicion fisica no reconocido. Por favor ingrese uno valido";
        }

        //mostrar la rutina
        System.out.println("Tu rutina de ejercicios es: \n" + rutina);
    }
}