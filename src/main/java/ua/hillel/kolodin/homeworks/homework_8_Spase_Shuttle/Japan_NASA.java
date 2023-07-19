package ua.hillel.kolodin.homeworks.homework_8_Spase_Shuttle;

public class Japan_NASA {
    public static void main(String[] args) {
        //У Японії числа 4 та 9 вважаються нещасливими.
        // Вам потрібно пронумерувати 100 космічних шатлів для перевезення людей на Марс так, щоб у номерах
        // шатлів не траплялося нещасливих чисел. Напишіть функцію, яка виводить усі номери таких шатлів.

        int numbers = 0; //початкове число
        int shuttle = 1;// визначаємо  кількість чисел

        while (shuttle <= 100) {//тут перевірка до 200 шатлів. Добавлено в IF дані.
            numbers++;
            {   int result=numbers/10;
                int result2=numbers%10;
                if (result == 4 || result == 9 || result2 == 4 || result2 == 9 || result == 14 || result == 19 || result == 24 || result == 29) {
                    continue;
                }
            }
            System.out.println("Shuttle number->" + shuttle++ + " has number :" + numbers);
        }
    }
}





