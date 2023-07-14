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


        for (int i = 9; i >= 0; i--) {
            Scanner scanner = new Scanner(System.in);
            String teamTerorists = "Terorists team:", team_Counter_Terorists = "CounterTerorists team :";// Team names
            byte players = 5;
            int totalScore1 = 0;
            int totalScore2 = 0;
            double averageScore1 = 0;
            double averageScore2 = 0;
            System.out.println(teamTerorists);
            System.out.println("Put score for each player (use numbers only from -128 ... 127): ");

            if (scanner.hasNextByte()) {
                byte player_Terorists_1 = scanner.nextByte();
                byte player_Terorists_2 = scanner.nextByte();
                byte player_Terorists_3 = scanner.nextByte();
                byte player_Terorists_4 = scanner.nextByte();
                byte player_Terorists_5 = scanner.nextByte();

                totalScore1 = totalScore1 + (player_Terorists_1 + player_Terorists_2 + player_Terorists_3 + player_Terorists_4 + player_Terorists_5);
                System.out.println("Total score : " + totalScore1);
                averageScore1 = averageScore1 + ((double) totalScore1 / players);
                System.out.println("Avarage score " + teamTerorists + " is " + averageScore1);

            } else {
                System.out.println("Use numbers only! Push \"Restart\" and try again...");
                System.exit(0);
            }
            System.out.println("___________________________________________________________________________________");

            System.out.println(team_Counter_Terorists);
            System.out.println("Put score for each player (use numbers only from -128 ... 127)");
            if (scanner.hasNextByte()) {
                byte player_Counter_Terorists_1 = scanner.nextByte();
                byte player_Counter_Terorists_2 = scanner.nextByte();
                byte player_Counter_Terorists_3 = scanner.nextByte();
                byte player_Counter_Terorists_4 = scanner.nextByte();
                byte player_Counter_Terorists_5 = scanner.nextByte();

                totalScore2 = totalScore2 + (player_Counter_Terorists_1 + player_Counter_Terorists_2 + player_Counter_Terorists_3 + player_Counter_Terorists_4 + player_Counter_Terorists_5);
                System.out.println("Total score : " + totalScore2);
                averageScore2 = averageScore2 + ((double) totalScore2 / players);
                System.out.println("Avarage score " + team_Counter_Terorists + " is " + averageScore2);

            } else {
                System.out.println("Use numbers only! push \"Restart\" and try again... ");
                System.exit(0);
            }
            System.out.println("Finish battle: ");
            if (averageScore1>averageScore2){
                System.out.println("Перемогла команда " + teamTerorists+ " набрала " + averageScore1 + " очків");
            } else if (averageScore1<averageScore2) {
                System.out.println("Перемогла команда " + team_Counter_Terorists+ " набрала " + averageScore2 + " очків");
            }else {
                System.out.println("Перемогла дружба!!!");
            }
            System.out.println("Battles left: " + i);
            System.out.println("****************************************************");
        }
    }
}



