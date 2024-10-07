import java.sql.SQLOutput;
import java.util.Scanner;
public class Secuenciales_1 {
    public static void main(String[] args) {
        int dia, mes, anio;
        String signo = "";
        String horoscopo = "";
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce tu dia de nacimiento: ");
        dia = sc.nextInt();
        System.out.print("Introduce tu numero de mes: ");
        mes = sc.nextInt();
        System.out.print("Introduce tu año: ");
        anio = sc.nextInt();
        System.out.print("La fecha introducida es: "+dia+"/"+mes+"/"+anio);
        if (mes==1){
            if (dia>=21){
                signo = "Acuario";
                horoscopo = "Si bien usted ya sabe que le cuesta, deberá aceptar con paciencia lo que esta viviendo y elaborar un nuevo plan para alcanzar sus objetivos. No se rinda.";
            } else {
                signo = "Capricornio";
                horoscopo = "Momento para dejarse de inhibirse frente a los demás por miedo al desprecio. Haga lo posible para enseñarle al mundo lo que es capaz de hacer y siente.";
            }
        }
        if (mes == 2){
            if (dia >= 19){
                signo = "Piscis";
                horoscopo = "Antes de tomar esa decisión trascendental para su vida, intente tomar las precauciones necesarias. Podría surgir algún riesgo si no actúa de forma responsable.";
            } else {
                signo = "Acuario";
                horoscopo = "Si bien usted ya sabe que le cuesta, deberá aceptar con paciencia lo que esta viviendo y elaborar un nuevo plan para alcanzar sus objetivos. No se rinda.";
            }
        }
        if (mes == 3){
            if (dia >= 20){
                signo = "Aries";
                horoscopo = "Quite los viejos pensamientos y costumbres vividas. Comprenda que en la vida no hay que quedarse solo con el pasado, al contrario, aprenda nuevas experiencias.";
            } else {
                signo = "Piscis";
                horoscopo = "Antes de tomar esa decisión trascendental para su vida, intente tomar las precauciones necesarias. Podría surgir algún riesgo si no actúa de forma responsable.";
            }
        }
        if (mes == 4){
            if (dia >= 20){
                signo = "Tauro";
                horoscopo = "En caso de ver que las cosas se tornen un tanto complicadas, procure calmarse y no actuar de manera precipitada. Sea inteligente en el momento de accionar.";
            } else {
                signo = "Aries";
                horoscopo = "Quite los viejos pensamientos y costumbres vividas. Comprenda que en la vida no hay que quedarse solo con el pasado, al contrario, aprenda nuevas experiencias.";
            }
        }
        if (mes == 5){
            if (dia >= 21) {
                signo = "Geminis";
                horoscopo = "Procure abandonar sus pensamientos superficiales, de lo contrario, no podrá alcanzar los objetivos que se propuso. Intente ser más realista en la vida.";
            } else {
                signo = "Tauro";
                horoscopo = "En caso de ver que las cosas se tornen un tanto complicadas, procure calmarse y no actuar de manera precipitada. Sea inteligente en el momento de accionar.";
            }
        }
        if (mes == 6){
            if (dia >= 20){
                signo = "Cancer";
                horoscopo = "Este atento, ya que su impaciencia con la que actúa podría traerle algunas consecuencias negativas. Trate de cuidar la manera en cómo se expresa y lo que hace.";
            } else {
                signo = "Geminis";
                horoscopo = "Procure abandonar sus pensamientos superficiales, de lo contrario, no podrá alcanzar los objetivos que se propuso. Intente ser más realista en la vida.";
            }
        }
        if (mes == 7){
            if (dia >= 22){
                signo = "Leo";
                horoscopo = "Momento óptimo para hacerle frente a lo que más miedo le tiene, aunque se sienta indefenso. Esto le traerá a su vida muchos cambios positivos.Momento óptimo para hacerle frente a lo que más miedo le tiene, aunque se sienta indefenso. Esto le traerá a su vida muchos cambios positivos.";
            } else {
                signo = "Cancer";
                horoscopo = "Este atento, ya que su impaciencia con la que actúa podría traerle algunas consecuencias negativas. Trate de cuidar la manera en cómo se expresa y lo que hace.";
            }
        }
        if (mes == 8){
            if (dia >= 21){
                signo = "Virgo";
                horoscopo = "Comprenda que muchas veces las decisiones precipitadas pueden llegar a ser causa de un arrepentimiento futuro. Piense bien antes de actuar para luego no arrepentirse.";
            } else {
                signo = "Leo";
                horoscopo = "Momento óptimo para hacerle frente a lo que más miedo le tiene, aunque se sienta indefenso. Esto le traerá a su vida muchos cambios positivos.Momento óptimo para hacerle frente a lo que más miedo le tiene, aunque se sienta indefenso. Esto le traerá a su vida muchos cambios positivos.";
            }
        }
        if (mes == 9){
            if (dia >=22){
                signo = "Libra";
                horoscopo = "Momento para dejarse de inhibirse frente a los demás por miedo al desprecio. Haga lo posible para enseñarle al mundo lo que es capaz de hacer y siente.";
            } else {
                signo = "Virgo";
                horoscopo = "Comprenda que muchas veces las decisiones precipitadas pueden llegar a ser causa de un arrepentimiento futuro. Piense bien antes de actuar para luego no arrepentirse.";
            }
        }
        if (mes == 10){
            if (dia >=22){
                signo = "Escorpio";
                horoscopo = "Sepa que se acerca el momento para reconstruir su vida. Lo primero que tendrá que hacer es desprenderse de las malas situaciones vividas en el pasado.";
            } else {
                signo = "Libra";
                horoscopo = "Momento para dejarse de inhibirse frente a los demás por miedo al desprecio. Haga lo posible para enseñarle al mundo lo que es capaz de hacer y siente.";
            }
        }
        if (mes == 11){
            if (dia >= 21){
                signo = "Sagitario";
                horoscopo = "Aproveche las buenas energías planetarias que tendrá en estos días. Comparta y ponga en práctica las nuevas aspiraciones que tiene para su vida.";
            } else {
                signo = "Escorpio";
                horoscopo = "Sepa que se acerca el momento para reconstruir su vida. Lo primero que tendrá que hacer es desprenderse de las malas situaciones vividas en el pasado.";
            }
        }
        if (mes == 12){
            if (dia >= 21){
                signo = "Capricornio";
                horoscopo = "Momento para dejarse de inhibirse frente a los demás por miedo al desprecio. Haga lo posible para enseñarle al mundo lo que es capaz de hacer y siente.";
            } else {
                signo = "Sagitario";
                horoscopo = "Aproveche las buenas energías planetarias que tendrá en estos días. Comparta y ponga en práctica las nuevas aspiraciones que tiene para su vida.";
            }
        }
        System.out.println("\nTu signo del zodiaco es: " + signo);
        System.out.println(horoscopo);

    }

}
