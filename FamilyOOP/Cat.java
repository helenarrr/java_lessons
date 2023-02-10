package FamilyOOP;

import java.util.Iterator;

/**Класс кот, описывает конкретный вид животного*/
class Cat extends Animal implements Iterator<String>, Comparable<Cat> {
    @Override
    void voice() {
        System.out.println("мяу");
    }
    @Override
    void gogo() {
        System.out.println("Идти");
    }

    Cat(String type, int weight, String wool){
        this.type = type;
        this.weight = weight;
        this.wool = wool;
    }
    Cat(Object n1, Object n2) {

    }

    int index;

    @Override
    public boolean hasNext() {
        return index++ < 3;
    }

    /**Метод, возвращающий по каждому отдельному индексу определенное поле класса.*/
    @Override
    public String next() {
        switch (index) {
            case 1 -> {
                return String.format("Порода: %s", type);
            }
            case 2 -> {
                return String.format("Котик весит: %s кг", weight);
            }
            case 3 -> {
                return String.format("Шерсть у котика: %s", wool);
            }
        }
        return null;

    }
    /**Метод для сравнения двух классов по полю вес*/
    @Override
    public int compareTo(Cat o) {
        if (this.weight > o.weight) return 1;
        else if (this.weight < o.weight) return -1;
        else return 0;
    }
}
