package ua.hillel.kolodin.homeworks.homework_11_Matrix;


import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        //Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
        // Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість рядків від 1 до 100");
        int row = 0, column = 0;
        if (scanner.hasNextInt()) {
            row = scanner.nextInt();
            if (row > 100 || row < 0) {
                System.out.println("Невірні дані");
                System.exit(0);
            }
        } else {
            System.out.println("Тільки числа від 1 до 100!!!");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Введіть кількість стовпців від 1 до 100");
        if (scanner.hasNextInt()) {
            column = scanner.nextInt();
            if (column > 100 || column < 0) {
                System.out.println("Невірні дані");
                System.exit(0);
            }
        } else {
            System.out.println("Тільки числа від 1 до 100!!!");
            System.exit(0);
        }
        scanner.nextLine();
        System.out.println("Матриця М на N " + " = " + row + " X " + column + " з консолі ");

        int[][] array1 = new int[row][column];
        int[][] result = new int[column][row]; // міняємо місцями колони та рядки

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 101);
            }
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("_______________________________________________________________");
        System.out.println("Матриця після транспорування (N на M) " + column + " X " + row + " результат :");

        // створюємо цикл для транспорованої матриці

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = array1[j][i];                //строки=колонам а колони=строкам
            }
        }
        for (int i = 0; i < result.length ; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


