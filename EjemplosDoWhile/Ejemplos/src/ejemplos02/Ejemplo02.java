/*
 Al ejecutar el siguiente código, el usuario puede salir del ciclo cuando
ingrese las siguientes opciones
s
si
yes
y

 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "";
        double nota;
        boolean bandera = true;
        String salida;
        do {
            System.out.println("Ingrese calificación");
            nota = entrada.nextDouble();
            cadenaFinal = String.format("%s%.2f\n", cadenaFinal, nota);
            entrada.nextLine(); // limpieza de buffer

            System.out.println("Ingrese (s), (yes), (y) o (si), si desea salir del ciclo ");
            salida = entrada.nextLine();
            
            /*
            switch (salida) {
            case "s"
            case "yes"
            case "si"
            case "y"
                bandera = false
            break;
            tambien se puede utilizar el switch de esta manera para obt the same
            */
            if (salida.equals ("si") || salida.equals("s")
                    || salida.equals("yes") || salida.equals("y")){
                bandera= false;
            }
            
            

        } while (bandera); // (bandera==true)

        System.out.printf("Listado de Notas\n%s\n", cadenaFinal);
    }
}
