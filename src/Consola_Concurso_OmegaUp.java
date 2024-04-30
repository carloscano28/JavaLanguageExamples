import javax.swing.*;
import java.util.Scanner;


// Ejercicio con la formula general para ecuaciones de segundo grado

public class Consola_Concurso_OmegaUp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String palabra, p2;
        //double A,B,C = 0;
        double x1,x2 =0;
        double d =0;

        palabra = scanner.nextLine();
        p2 = palabra.replace(" ", "");
        System.out.println(p2);
        char p[] = p2.toCharArray();


        int A = Character.getNumericValue(p[0]);
        int B = Character.getNumericValue(p[1]);
        int C = Character.getNumericValue(p[2]);
        //int C = -6;

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        d = Math.pow(B,2) - 4*(A*C);

        x1 = (-B + Math.sqrt(d)) / 2*A ;
        x2 = (-B - Math.sqrt(d)) / 2*A ;
        System.out.println();
        System.out.println(x1 + " " + x2);

    }
}
