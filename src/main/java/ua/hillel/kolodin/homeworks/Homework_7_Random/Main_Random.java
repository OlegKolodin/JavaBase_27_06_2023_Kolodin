package ua.hillel.kolodin.homeworks.Homework_7_Random;

import java.util.Scanner;

public class Main_Random {
    public static void main(String[] args) {
//        Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
//        Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).
        Scanner scanner = new Scanner(System.in);
        int minNumber = 0, maxNumber = 10, tryNumberUser = 4;
        for (int i = tryNumberUser; i >= 0; i--) {
            System.out.println("Try to guess number, which was generated in the system (0-10)");
            if (scanner.hasNextInt()) {
                int userNumber = scanner.nextInt();
                if (userNumber <= maxNumber && userNumber >= minNumber) {
                    int generatedNumber = (int) (Math.random() * (maxNumber - minNumber + 1) + minNumber);
                    System.out.println("You put " + userNumber);
                    System.out.println("System generated " + generatedNumber);
                    if (userNumber == generatedNumber) {
                        System.out.println("You win !!!!");
                    }
                } else {
                    System.out.println("Need to enter data from 0 to 10! Don't be a baby!!!");
                }
                if (i == 0) {
                    System.out.println("No more times! Top up Your credit card and come tomorrow.");
                    System.out.println("Good bye");
                } else {
                    System.out.println("left " + i + " time(s)");
                }
                System.out.println("---------------------------------------------");
            } else {
                System.out.println("Should be only numbers!!!");
                if (i == 0) {
                    System.out.println("No more times! Top up Your credit card and come tomorrow.");
                    System.out.println("----------------------------------------------");
                } else {
                    System.out.println("left " + i + " time(s)");
                    System.out.println("-----------------------------------------------");
                }
            }
            scanner.nextLine();
        }
    }
}