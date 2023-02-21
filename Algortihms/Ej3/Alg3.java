package Ej3;

import java.util.Scanner;

public class Alg3 {

    public static void main(String[] args) {

        int horasTrabajadas =  leerHorasTrabajadas();
        double tarifa = leerTarifa();

        respuesta(horasTrabajadas, tarifa);

    }

    public static int leerHorasTrabajadas() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de horas, porfavor: ");

        return keyboard.nextInt(); // (?) No cerramos el Scanner porque se trata de un System.in

    }

    public static double leerTarifa() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese una tarifa, porfavor: ");

        return keyboard.nextDouble(); // (?) No cerramos el Scanner porque se trata de un System.in

    }

    public static void respuesta( int horasTrabajadas, double tarifa ){

        double sueldo = 0;
        String euro = java.util.Currency.getInstance("EUR").getSymbol();

        sueldo = ( horasTrabajadas > 40 ) ? 40 * tarifa + ( horasTrabajadas - 40) * ( tarifa * 1.5 ) : horasTrabajadas * tarifa;
        sueldo = Math.round( sueldo ); // (?) Redondeamos

        System.out.println("Su sueldo es de: " + sueldo + euro +" a la semana y " + sueldo*4 + euro + " al mes");

    }

}
