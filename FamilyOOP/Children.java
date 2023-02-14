package FamilyOOP;

class Children extends Human implements IPetOwner {
    private final String name;

    Children(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    int hunger() {
        return (int)(Math.random() * 9);
    }
    void goEat() {
        System.out.println("Ест...");
        int food = (int)(Math.random() * 3);
        int hunger = hunger() - food;
        int trueLevelFood = 5;
        if (hunger == trueLevelFood)
            System.out.println("Ребенок больше не голоден");
        else if (hunger < trueLevelFood) {
            goEat();
        }
        else {
            System.out.println("Ребенок переел");
        }
    }
    @Override
    int go(int start) {
        int step = (int)(Math.random() * 7);
        int finish = start + step;
        return finish;
    }

    @Override
    public void call() {
        System.out.println("Агу Агу");
    }
}

