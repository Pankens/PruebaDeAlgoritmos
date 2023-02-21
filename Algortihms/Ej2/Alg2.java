package Ej2;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Alg2 {
    
    public static void main(String[] args) {

        resultado(leerPersonas());

    }

    public static ArrayList<Persona> leerPersonas() {

        ArrayList<Persona> personas = new ArrayList<Persona>();

        int edad = 0;
        char sexo = 'f';

        while ( personas.size() < 50 ) {

            edad = (int)( Math.random() * ((100 - 1) + 1) + 1 );
            sexo = ( Math.random() < 0.5 ) ? 'f' : 'm';
            
            personas.add(new Persona( edad, sexo ));

        }        

        return personas;

    }

    public static void resultado( ArrayList<Persona> personas ){

        int formulaPorcentaje = 100 / personas.size();

        ArrayList<Persona> mayoresDe18 = personas.stream().filter(persona -> persona.getEdad() >= 18).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Persona> menoresDe18 = personas.stream().filter(persona -> persona.getEdad() < 18).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Persona> hMayoresDe18 = mayoresDe18.stream().filter(persona -> persona.getSexo() == 'm').collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Persona> mMenoresDe18 = menoresDe18.stream().filter(persona -> persona.getSexo() == 'f').collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Persona> mujeres = personas.stream().filter(persona -> persona.getSexo() == 'f').collect(Collectors.toCollection(ArrayList::new));
        int porcentajeMayores = ( mayoresDe18.size() * formulaPorcentaje );
        int porcentajeMujeres = ( mujeres.size() * formulaPorcentaje );

        System.out.println( "Mayores de edad: " + "------------- [ " + mayoresDe18.size() + "% ]" );
        System.out.println( "Menores de edad: " + "------------- [ " + menoresDe18.size() + "% ]" );
        System.out.println( "Hombres mayores de edad: " + "----- [ " + hMayoresDe18.size() + "% ]" );
        System.out.println( "Mujeres menores de edad: " + "----- [ " + mMenoresDe18.size() + "% ]" );
        System.out.println( "Porcentaje de mayores de edad: " + "[ " + porcentajeMayores + "% ]" );
        System.out.println( "Porcentaje de mujeres: " + "------- [ " + porcentajeMujeres + "% ]" );


    }

}
