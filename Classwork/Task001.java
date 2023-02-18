package Classwork;
// 1. Реализация pow (x, n), которая вычисляет x, возведенный в степень n (т.е. xn).

// Input: x = 2.00000, n = 10
// Output: 1024.00000

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        double x;
        int n;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        n = scanner.nextInt();
        double result = 1;
        scanner.close();
        if (n < 0) {
            x = 1 / x;
            n *= -1;
        }
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        System.out.println("result= " + result);
    }
}