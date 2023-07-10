package ua.hillel.kolodin.homeworks.homework_4;

import java.util.Scanner;

public class My_App {
    public static void main(String[] args) {
        System.out.println("Count volume of PARALELEPIPEDA , whith formula : V=length * height * width");
        Scanner typeUser = new Scanner(System.in);
        System.out.println("Enter 3 data for counting volume: ");
        double lenght = typeUser.nextDouble(), height = typeUser.nextDouble(), width = typeUser.nextDouble(), volume = 0;
        volume = volume + lenght*width*height;
        System.out.println("volume is "+ volume);

        System.out.println("--------------------------------------------------------");

        System.out.println("Or another way:");
        System.out.println("enter length");
        double a = typeUser.nextDouble();
        System.out.println("enter width");
        double b = typeUser.nextDouble();
        System.out.println("enter height");
        double c = typeUser.nextDouble();
        double volume_1 = a*b*c;
        System.out.println("Volume is " + volume_1);

    }
}
