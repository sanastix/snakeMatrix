package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int counter = 1;

        int [][] arr = new int[n][n];

        for (int i = 0; i < n; i++){
            if (n == 1) {
                System.out.println(1);
                break;
            }
            if (i % 2 == 0){
                for (int j = 0; j < n ; j++) {
                    arr[i][j] = counter;
                    counter++;
                }
            } else {
                for (int j = n-1; j >= 0 ; j--) {
                    arr[i][j] = counter;
                    counter++;
                }
            }
        }

        in.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}