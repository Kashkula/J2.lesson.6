package com.company;

public class Main {

    public static void main(String[] args) {
        Count<Integer> count = new Count<>(10, 5);
        count.minus(12, 29);
        count.plus(54, 2);

    }

    /*
    Создать обобщенный класс и обобщенный интерфейс и реализовать этот интерфейс классом.
    Ограничить параметры типов классом Number.
    В главном классе создать несколько экземпляров обобщенного класса.
     */
}
