package ua.hillel.kolodin.homeworks.Homework_6_CS;

import java.util.Scanner;

public class Counter_Strike_6 {
    public static void main(String[] args) {
        /*ввести ім'я першої команди
        ввести кількість фрагів для 5-ти гравців першої команди (тобто має бути 5 змінних)
        ввести ім'я другої команди
        ввести кількість фрагів для 5-ти гравців другої команди (тобто має бути 5 змінних)
        підрахувати середнє арифметичне балів кожної команди
        порівняти результати команд та визначити переможця
        вивести у консоль:
        "Перемогла команда" + teamName + "набрала" + result + "очків"*/

        for (int i = 10; i >= 0; i--) {
            String teamTerrorists = "Terrorists", counterTerrorists = "Counter_terrorists",

                    message = "Введи кількість балів для кожного з ",
                    message2 = "Діапазон введених балів повинен бути від -20 до 20",
                    warning = "Читай уважно та виконуй написані інструкції!",
                    warning2 = "Введи число а не символ, не намагайся обійти систему!";

            byte players = 5;
            int totalScore = 0, totalScore2 = 0;
            double avarageScore = 0, avarageScore2 = 0;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введи назву першої команди " + "\"" + teamTerrorists + "\" або натисни" + " \"1" + "\"");
            if (scanner.hasNextLine()) {
                String name1 = scanner.nextLine();
                if (name1.equals(teamTerrorists) || name1.equals("1")) {
                    System.out.println("Команда " + teamTerrorists);
                } else {
                    System.out.println(warning);
                    System.exit(0);
                }
            }
            System.out.println(message + players + " гравців" + "\n" + message2);
            byte pl1 = 1;
            byte pl2 = 1;
            byte pl3 = 1;
            byte pl4 = 1;
            byte pl5 = 1;
            if (scanner.hasNextByte()) {
                pl1 = scanner.nextByte();
                if (pl1 < -20 || pl1 > 20) {
                    System.out.println(warning);
                    System.exit(0);
                }
            } else {
                System.out.println(warning2);
                System.exit(0);
            }
            if (scanner.hasNextByte()) {
                pl2 = scanner.nextByte();
                if (pl2 < -20 || pl2 > 20) {
                    System.out.println(warning);
                    System.exit(0);
                }
            } else {
                System.out.println(warning2);
                System.exit(0);
            }
            if (scanner.hasNextByte()) {
                pl3 = scanner.nextByte();
                if (pl3 < -20 || pl3 > 20) {
                    System.out.println(warning);
                    System.exit(0);
                }
            } else {
                System.out.println(warning2);
                System.exit(0);
            }
            if (scanner.hasNextByte()) {
                pl4 = scanner.nextByte();
                if (pl4 < -20 || pl4 > 20) {
                    System.out.println(warning);
                    System.exit(0);
                }
            } else {
                System.out.println(warning2);
                System.exit(0);
            }
            if (scanner.hasNextByte()) {
                pl5 = scanner.nextByte();
                if (pl5 < -20 || pl5 > 20) {
                    System.out.println(warning);
                    System.exit(0);
                }
            } else {
                System.out.println(warning2);
                System.exit(0);
            }
            totalScore = totalScore + (pl1 + pl2 + pl3 + pl4 + pl5);
            avarageScore = avarageScore + ((double) totalScore / players);
            System.out.println("Сума балів команди " + teamTerrorists + " " + totalScore);
            System.out.println("Середній бал " + avarageScore);
            System.out.println("*************************************************");
            scanner.nextLine();
            System.out.println("Введи назву другої команди " + "\"" + counterTerrorists + "\"" + "або натисни" + " \"2\"");
            if (scanner.hasNextLine()) {
                String name1_2 = scanner.nextLine();
                if (name1_2.equals(counterTerrorists) || name1_2.equals("2")) {
                    System.out.println("Команда " + counterTerrorists);
                } else {
                    System.out.println(warning);
                    System.exit(0);
                }
            }

            System.out.println(message + players + " гравців");
            byte pl1_2 = 1;
            byte pl2_2 = 1;
            byte pl3_2 = 1;
            byte pl4_2 = 1;
            byte pl5_2 = 1;
            if (scanner.hasNextByte()) {
                pl1_2 = scanner.nextByte();
                if (pl1_2 < -20 || pl1_2 > 20) {
                    System.out.println(warning);
                    System.exit(0);
                }
            } else {
                System.out.println(warning2);
                System.exit(0);
            }
            if (scanner.hasNextByte()) {
                pl2_2 = scanner.nextByte();
                if (pl2_2 < -20 || pl2_2 > 20) {
                    System.out.println(warning);
                    System.exit(0);
                }
            } else {
                System.out.println(warning2);
                System.exit(0);
            }
            if (scanner.hasNextByte()) {
                pl3_2 = scanner.nextByte();
                if (pl3_2 < -20 || pl3_2 > 20) {
                    System.out.println(warning);
                    System.exit(0);
                }
            } else {
                System.out.println(warning2);
                System.exit(0);
            }
            if (scanner.hasNextByte()) {
                pl4_2 = scanner.nextByte();
                if (pl4_2 < -20 || pl4_2 > 20) {
                    System.out.println(warning);
                    System.exit(0);
                }
            } else {
                System.out.println(warning2);
                System.exit(0);
            }
            if (scanner.hasNextByte()) {
                pl5_2 = scanner.nextByte();
                if (pl5_2 < -20 || pl5_2 > 20) {
                    System.out.println(warning);
                    System.exit(0);
                }
            } else {
                System.out.println(warning2);
                System.exit(0);
            }
            totalScore2 = totalScore2 + (pl1_2 + pl2_2 + pl3_2 + pl4_2 + pl5_2);
            avarageScore2 = avarageScore2 + ((double) totalScore2 / players);
            System.out.println("Сума балів команди " + counterTerrorists + " " + totalScore2);
            System.out.println("Середній бал " + avarageScore2);

            if (avarageScore < avarageScore2) {
                System.out.println("Перемогла команда " + counterTerrorists + " та набрала " + avarageScore2);
            } else if (avarageScore > avarageScore2) {
                System.out.println("Перемогла команда " + teamTerrorists + " та набрала " + avarageScore);
            } else {
                System.out.println("Перемогла дружба");
            }
            System.out.println("Залишилось " + i + " боїв");
        }
    }
}
















