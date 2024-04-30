package data_structure;

import javax.swing.*;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int array[], nElemts, aux;
        nElemts = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del array"));
        array = new int [nElemts];

        for(int i=0; i<nElemts; i++){
            System.out.println((i+1)+".- Digite un numero: ");
            array[i] = scanner.nextInt();
        }

        // Metodo burbuja
        for (int i=0; i<(nElemts-1); i++){
            for (int j=0; j<(nElemts-1); j++){
                if(array[j]> array[j+1]){
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }

        // Mostrando arreglo de forma creciente
        System.out.println("Arreglo ordenado de forma creciente");
        for(int i=0;i<nElemts;i++){
            System.out.println(array[i]+ "  -  ");
        }
        System.out.println("");

    }


}
