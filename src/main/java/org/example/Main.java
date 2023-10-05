package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int[][] arr = new int[n][n];
        int counter = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = counter++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    arr[i][j] = counter++;
                }
            }
        }

        int width = (int) Math.log10(n * n) + 1; // Визначення ширини поля для виводу

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%" + width + "d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
