package Homework.task001;

import java.util.Scanner;

public class Task001 {
    /**
     * Дана последовательность N целых чисел. Найти сумму простых чисел.
     * Принимает длинну последовательности;
     * Выводит на экран простые числа в последовательности;
     * Выводит на экран сумму последовательности простых чисел.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Задайте длинну последовательности:\n");
        int top = scanner.nextInt();
        System.out.print("Простые числа:\n");
        for (int i = 2; i <= top; i++) {
            if (checkSimple(i))
                System.out.println(i);
        }
        int sum = 0;
        for (int i = 2; i <= top; i++) {
            if (checkSimple(i))
                sum += i;
        }
        System.out.print("Сумма простых чисел:\n" + sum);
        scanner.close();
    }

    /**
     * Определяет простые числа в последовательности.
     * @param i
     * @return
     */
    public static boolean checkSimple(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }
}
