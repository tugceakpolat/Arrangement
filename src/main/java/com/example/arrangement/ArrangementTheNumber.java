package com.example.arrangement;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangementTheNumber {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the arrays size : ");
        int input = scanner.nextInt();

        int [] numbers = new int [input];

        System.out.println("Please enter arrays numbers ");
        for (int i=0; i< numbers.length ; i++){
            System.out.print("Enter " + (i+1) + ". number : " );
            numbers [i] = scanner.nextInt();
        }

        System.out.println("Arrays: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Arrangement arrays : " + Arrays.toString(numbers));


    }
}
