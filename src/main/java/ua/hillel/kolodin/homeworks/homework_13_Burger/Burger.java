package ua.hillel.kolodin.homeworks.homework_13_Burger;

public class Burger {

    //Зробити клас Burger, який матиме поля:
    //булочка, м'ясо, сир, зелень, майонез
    //
    //Зробити три конструктори, які дозволятимуть робити бургери трьох видів:
    //звичайний бургер (усі компоненти)
    //дієтичний бургер (без майонезу)
    //з подвійним м'ясом
    //У кожен конструктор додати виведення в консоль складу даного варіанту бургера
    // при створенні екземпляра бургера, який використовує даний конструктор - буде виводитися
    // в консоль його склад).
    //Зробити клас BurgerMain, в якому створити три різні бургери.
    // Їхній склад буде автоматично виводитися на екран під час запуску програми.


    //Свторюємо змінні - поля (складові бургера)
    public String bun , meat, cheese, greens , mayonnaise, meat2;

    //сворюємо конструктори з виведенням складових для кожного бургера
    Burger(String bun, String meat, String cheese, String greens, String mayonnaise){

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println ( "Звичайний бургер  : " +"\n"+ this.bun +", "+ this.meat+", " + this.cheese+", "+this.greens+", "+this.mayonnaise + "\n");

    }
    Burger(String bun, String meat, String cheese, String greens){

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println ( "Дієтичний бургер (без майонезу) : " +"\n"+ this.bun +", "+ this.meat+", " + this.cheese+", "+this.greens + "\n");

    }
    Burger(String meat2){

    this.meat2 = meat2;
        System.out.println ( "Подвійне м'ясо : " +"\n"+ this.meat2+ "\n");

    }
}

