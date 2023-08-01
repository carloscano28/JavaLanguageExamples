import java.util.Scanner;

/**
 *
 *  02/09/2022 -
 *  Objetivo: Dar seguimiento a java con los ejercicios que se trabajaron en 2022 e incluirlos en un solo proyecto
 *  crear repositorio git y subir a gitlab o github
 *  incluir mas funciones creando un menu de ejercicios y pruebas
 *  Dar seguimiento a aprendizaje en java 
 */

enum Dias {Lunes, Martes, Miercoles}
public class Basics_Java_2023 {
    public static void main(String[] args) {

        // Switch
        //Basic_java_switch basic_java_switch = new Basic_java_switch();
        //basic_java_switch.start_switch_int();
        //basic_java_switch.start_switch_string();

        // Array
        Basic_java_Array basic_java_array = new Basic_java_Array();
        basic_java_array.start_basic_array();

    }
}

class Basic_java_Array{
    public void start_basic_array(){

        System.out.println("*** Basic Array ***");
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Escribe una palabra ***");
        String palabra;
        palabra = scanner.next();
        char p[] = palabra.toCharArray();

        for (int count=0 ; count< p.length ; count++){
            System.out.print(p[count]);
        }
        System.out.println("");

        int x=0;
        int y[]={1,10,4,4,-5};

        int t[];
        t = new int[5];  // 5 tamanio del arreglo

        for (int count=0 ; count< y.length ; count++){
            t[count] = count *3;
            System.out.println(t[count]);
        }
    }
}

class Basic_java_switch{

    public void start_switch_int (){
        System.out.println("*** Basic Switch ***");
        //Scanner scanner = new Scanner(System.in);
        int z;
        z = 1;
        switch(z){
            case 0:
                System.out.println("x = 0");
                break;
            case 1:
                System.out.println("x = 1");
                break;
            case 2:
                System.out.println("x = 2");
                break;
            default:
                System.out.println("Default");
        }
    }

    public void start_switch_string(){
        System.out.println("*** Basic Switch ***");
        Dias z;
        z= Dias.Miercoles;
        switch(z){
            case Lunes:
                System.out.println("Lunes");
                break;
            case Martes:
                System.out.println("Martes");
                break;
            case Miercoles:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("Default");
        }
    }
}





