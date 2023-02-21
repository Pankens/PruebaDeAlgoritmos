package Ej1;
import java.util.Scanner;

class Alg1 {

    public static void main(String[] args) {
        
        int numero = LeerNumero();

        respuesta((numero % 2 == 0), numero);

    }

    public static int LeerNumero() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese un número porfavor: ");

        return keyboard.nextInt(); // (?) No cerramos el Scanner porque se trata de un System.in

    }

    public static void respuesta( boolean par, int numero ) {

        System.out.println(); // (?) Espacio en blanco
        System.out.println(); // (?) Espacio en blanco

        String tipo = ( par ) ? "par" : "impar";

        System.out.println("Su número es " + tipo);
        System.out.println("------------------------------------------------");

        while( numero > 0 ){

            System.out.println( numero );
            numero -= 2;

        }

        System.out.println( 0 );

    }

}
