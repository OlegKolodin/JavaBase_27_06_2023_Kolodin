package ua.hillel.kolodin.homeworks.homework_9_Rugby;


import java.util.Arrays;


public class Play {
    public static void main(String[] args) {
//        Є дві команди регбі з 25 гравців різного віку у кожній.
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//        Виведіть у двох рядках вік гравців кожної команди.
//        Порахуйте середній вік гравців кожної команди та виведіть на екран.
//
        //Оголошуємо змінні
        int minAge = 18, maxAge = 40;
        int[] team_Cats = new int[25];
        int[] team_Dogs = new int[25];
        int summaCatsAge = 0, summaDogsAge = 0;
        double avarageAgeCats = 0, avarageAgeDogs = 0;
        for (int i = 0; i < team_Cats.length; i++) {
            team_Cats[i] = (int) (Math.random() * (maxAge - minAge + 1) + minAge);
        }
        for (int i = 0; i < team_Cats.length; i++) {
            summaCatsAge = summaCatsAge + team_Cats[i];
        }
        for (int i = 0; i < team_Dogs.length; i++) {
            team_Dogs[i] = (int) (Math.random() * (maxAge - minAge + 1) + minAge);
        }
        for (int i = 0; i < team_Cats.length; i++) {
            summaDogsAge = summaDogsAge + team_Dogs[i];
        }
        avarageAgeCats = avarageAgeCats + ((double) summaCatsAge / team_Cats.length);
        avarageAgeDogs = avarageAgeDogs + ((double) summaDogsAge / team_Dogs.length);
        System.out.println("Team Cats - " + Arrays.toString(team_Cats) + "  - " + team_Cats.length + " players");
        System.out.println("Team Dogs - " + Arrays.toString(team_Dogs) + "  - " + team_Dogs.length + " players");
        System.out.println("Total years Cats team - " + summaCatsAge + ". Avarage age for Cats team " + avarageAgeCats);
        System.out.println("Total years Dogs team -" + summaDogsAge + ". Avarage for Dogs team " + avarageAgeDogs);
        if (avarageAgeCats > avarageAgeDogs) {
            System.out.println("Team Cats is more older, respect grandfathers))))");
        } else if (avarageAgeCats < avarageAgeDogs) {
            System.out.println("Team Dogs is older, respect old dogs )))) ");
        } else {
            System.out.println("Same age");
        }
    }
}
//int name = (int) (Math.random() * (maxNumber - minNumber + 1) + minNumber);
