package com.rtyu;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args) {
        System.out.println("**************************************************");
        System.out.println("This is a calculater created by me in java");
        System.out.println("**************************************************");

        //To get first input
        Scanner firstValue = new Scanner(System.in);
        System.out.println("Input your first number");
        int x = firstValue.nextInt();
        //To get second value
        Scanner secondValue = new Scanner(System.in);
        System.out.println("enter your second number");
        int y = secondValue.nextInt();
        //To get the operation
        Scanner operation = new Scanner(System.in);
        System.out.println("to multiply choose 1,to add 2,to substract 3,to divide 4 ");
        int z = operation.nextInt();

        if (z==1) {
            System.out.println(x * y);
        }
        else if (z==2){
            System.out.println(x+y);
        }

        else if (z==3){
            System.out.println(x-y);
        }

        else if (z==4){
            System.out.println(x/y);
        }



    }
}
