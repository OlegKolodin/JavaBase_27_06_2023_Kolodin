package ua.hillel.kolodin.homeworks.homework5;

import java.util.Scanner;

public class ChinaWar {
    public static void main(String[] args) {
        // Лі:

        //воїн - 13     *860
        //лучник - 24
        //вершник - 46
        int li_sold = 13, li_archer = 24, li_horseman = 46, li_amount = 860, li_totalAttack = 0;
        li_totalAttack = li_totalAttack + (li_amount * (li_sold + li_archer + li_horseman));

        System.out.println("Attack Li : " + li_totalAttack);

        //Мінь:

        //воїн - 9 (860*1.5)== 1290;
        //лучник - 35
        //вершник - 12
        int min_sold = 9, min_archer = 35, min_horseman = 12, min_amount = 1290, min_totalAttack = 0;
        min_totalAttack = min_totalAttack + (min_amount * (min_sold + min_archer + min_horseman));
        System.out.println("Attack - Min : " + min_totalAttack);
        System.out.println("---------------------------------------------------------------");

        System.out.println("or variant 2 with using class Scanner :");

        Scanner enterFromUser = new Scanner(System.in);
        while (true) {
            System.out.print("Enter dynasty number : \n");
            System.out.println("1");
            System.out.println("2");
            String dynasty = enterFromUser.nextLine();
            if (dynasty.equals("1")) {
                System.out.println("1 - Attack Li : " + li_totalAttack);
            } else if (dynasty.equals("2")) {
                System.out.println("2 - Attack Min : " + min_totalAttack);
            } else {
                System.out.println("Choose only 1 or 2. Restart ...");
                break;
            }
        }
    }




    }
