package com.rtyu;
import java.util.Scanner;

public class multiplicationTable {
    public static  void main(String[] args) {
        System.out.println("**************************************************");
        System.out.println("this program can print table of given number");
        System.out.println("**************************************************");

        Scanner table = new Scanner(System.in);
        System.out.println("input a number whose table you want");
        int t = table.nextInt();

        System.out.println("Table of "+t+" = ");
        for(int i=t;i<=t*10;i=i+t){
            System.out.println(i);
        }
    }
}
