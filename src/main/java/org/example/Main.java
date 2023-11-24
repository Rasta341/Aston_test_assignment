package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String input = sc.next();
        String name = "Вячеслав";
        System.out.println(input.equalsIgnoreCase(name)?"Привет, " + input: "Такого имени нет");
        System.out.println("Введите число: ");
        int inputNumber = sc.nextInt();
        System.out.println(inputNumber > 7?"Привет":"Введенное число меньше 7");
        System.out.println("Введите массив чисел (через запятую, без пробелов): ");
        input = sc.next();
        String[] arr = input.split(",");
        System.out.println("Числа массива, которые делятся на 3: ");
        for (String s : arr) {
            if (Integer.parseInt(s) % 3 == 0) {
                System.out.println(s);
            }
        }
        sc.close();
    }
}