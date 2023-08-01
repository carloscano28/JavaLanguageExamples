package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Exercise_prime_Numbers {

    public static void main(String[] args) {

        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader b= new BufferedReader(in);

        try {
            System.out.println("Until what number you want to see prime numbers?");
            int num = Integer.parseInt(b.readLine());
            Prime_Numbers p = new Prime_Numbers();
            p.start(num);

        }catch (IOException exception){
            System.out.println("Introduce numero valido");
        }

    }

}


public class Prime_Numbers {

    public void start( int limite){
        for(int i=1 ; i<=limite; i++){
            if(isPrime(i)){
                System.out.println("Prime number is:" +i);
            }
        }
    }

    public boolean isPrime(int num) {
        int aux;
        for(int cont=2;cont<num;cont++)
        {
            aux=num%cont;
            if(aux==0){
                return false;
            }
        }
        return true;
    }
}


