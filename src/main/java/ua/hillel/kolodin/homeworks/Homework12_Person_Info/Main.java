package ua.hillel.kolodin.homeworks.Homework12_Person_Info;

//Зробити клас Person та в ньому метод personInfo()
//        На вхід передавати йому чотири параметри: ім'я, прізвище, місто, телефон
//        Всередині методу формувати рядок у форматі: Зателефонувати громадянину + ІМ'Я ПРІЗВИЩЕ + із міста + МІСТО можна за номером + ТЕЛЕФОН
//        Метод має повертати String
//        У main-методі зробити три виклики методу personInfo, щоразу передаючи нову людину;
//        Повинен вийти висновок такого типу:
//        Зателефонувати громадянинові Will Smith з міста New York можна за номером 2936729462846.
//
//        Зателефонувати громадянинові Jackie Chan з міста Shanghai можна за номером 12312412412.
//
//        Зателефонувати до громадян Sherlock Holmes з міста  можна за номером 37742123513.
public class Main {
    public static void main(String[] args) {
        Person.personInfo("Will", "Smith", "New York", "2936729462846");
        Person.personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        Person.personInfo("Sherlock", "Holmes ", "London", "37742123513");
    }
}

class Person {
    public static void personInfo(String name, String surname, String city, String phoneNumber) {
        System.out.println("Зателефонувати громадянину " + name + " " + surname + " із міста " + city + " можна за номером " + phoneNumber);

    }
}