package FamilyOOP;

/**Это абстрактный класс животные*/
abstract class Animal {
    protected String type;
    protected int height;
    protected int weight;
    protected String wool;

    /**Метод описывает какие звуки издает животное*/
    abstract void voice();
    /**С помощью метода описывается специфичное для каждого вида движение животного*/
    abstract void gogo();
}