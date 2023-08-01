package data_structure;

public class Binary_to_decimal {

    public static void main(String[] args) {

        System.out.println("Operaciones Bitwise");
        System.out.println(toint("111"));
        // 7 -> 2^2 + 1^2 + 0^2 = 4+2+1 = 7

    }

    public static int toint(String bin){
        int result = 0;
        char binaryArr[] = bin.toCharArray();
        for (int i=0; i<binaryArr.length; i++,result<<=1){
            //result<<=1; // Rotacion a la izquierda
            result |= (binaryArr[i]== '0')?0:1; //
        }
        result >>=1;
        return result;
    }

}
