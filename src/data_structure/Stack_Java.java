package data_structure;

public class Stack_Java {

    String arr[];
    int maxSize ;
    int top;
    public static void main(String[] args) {

        Stack_Java stackJava = new Stack_Java(3);

        stackJava.push("1");
        stackJava.push("2");
        stackJava.push("3");
        stackJava.push("4");
        stackJava.push("5");

        System.out.println(stackJava.peek());
        System.out.println(stackJava.empty());
        System.out.println(stackJava.pop());
        System.out.println(stackJava.empty());



    }

    public Stack_Java(int n){
        maxSize = n;
        arr = new String[maxSize];
        top=0;

    }
    public boolean empty (){
        if(top==0){
            return true;
        }else{
            return false;
        }
    }
    public void push(String str){
        if(top< maxSize){
            arr[top]= str;
            top++;
        }
    }

    public String peek(){
        if(top > 0){
            return arr[top-1];
        }else{
            return null;
        }
    }

    public String pop(){
        String temp =null;
        if(top>0){
            temp = arr[top-1];
            arr[top-1]= null;
            top--;
        }
        return temp;
    }


}


