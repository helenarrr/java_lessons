package ru.geekbrains;

public class lesson2Steps {
    static void move(char point1, char point2) {
        System.out.println("Передвигаем из стержня " + point1 + " в стержень " + point2);
    }

    static void moveTower(int amount, char point1, char point2, char temp) {
        if (amount == 0) {
            return;
        }
        moveTower(amount - 1, point1, temp, point2);
        move(point1, point2);
        moveTower(amount - 1, temp, point2, point1);
    }
}
