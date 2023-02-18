package Homework.task002;

import java.util.Scanner;

/**
 * Дана последовательность из N целых чисел. Верно ли, что последовательность
 * является возрастающей.
 * 
 * @param args
 */
public class Task002 {
    public static void main(String[] args) {
        System.out.print("Задайте длинну последовательности:\n");
        int n = userInput();
        System.out.println("Введите последовательность:");
        int num1 = userInput();
        boolean flag = true;
        while (n > 1) {
            int num2 = userInput();
            if (num1 < num2) {
                num1 = num2;
                n--;
            } else {
                flag = false;
                n = 0;
            }
        }
        if (flag) {
            System.out.println("Последовательность возврастающая!");
        } else {
            System.out.println("Последовательность не возврастающая!");
        }
    }

    /**
     * Принимает ввод пользователя и
     * проверяет на корректность ввода
     *
     * @return целое число
     */
    public static int userInput() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.print("Ошибка ввода!\nВведите целое число: ");
                sc.next();
            }
            sc.close();
        }
    }
}
