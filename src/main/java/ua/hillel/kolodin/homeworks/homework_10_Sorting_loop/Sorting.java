package ua.hillel.kolodin.homeworks.homework_10_Sorting_loop;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
//        Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
//        Перший масив -це числа, які загадані фірмою -організатором лотереї.
//        Другий масив - це числа, які вгадав гравець.
//        Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь - яким способом.
//        У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом;
//        Наприклад:
//        first[3] повинен дорівнювати second[3], як показано нижче.
//        Приклад виведення в консоль (збіглися 1 й, 4 й та 6 й елементи):
//         [0, 1, 4, 5, 5, 8, 9]
//         [1, 1, 2, 3, 5, 6, 9]
//         Кількість збігів:3
//
        int first_numFromUser[] = new int[7];
        int second_numFromSystem[] = new int[7];

        System.out.println("Enter numbers (0-9) ");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < first_numFromUser.length; i++) {
            if (scanner.hasNextInt()) {
                first_numFromUser[i] = scanner.nextInt();
                if (first_numFromUser[i]<0||first_numFromUser[i]>9){
                    System.out.println("Use numbers 0-9");
                    System.exit(0);
                }
            } else {
                System.out.println("Only numbers!!!!");
                System.exit(0);
            }
        }
        for (int i = 0; i < second_numFromSystem.length; i++) {
            second_numFromSystem[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(first_numFromUser);
        Arrays.sort(second_numFromSystem);

        System.out.println(Arrays.toString(first_numFromUser) + "User numbers");
        System.out.println(Arrays.toString(second_numFromSystem) + "System numbers");

        int numbers = 0;      // вводимо змінну для підрахунку збігів
        for (int i = 0; i < first_numFromUser.length; i++) {
            if (second_numFromSystem[i] == first_numFromUser[i]) { //якщо значення масивів в комірках [] будуть однакові виводимо номер комірки
                System.out.println("Збіглися: " + i + " комірка");
                numbers++; // збільшуємо збіги після кожної ітерації
            }
        }
        System.out.println("Кількість збігів : " + numbers);
    }
}



