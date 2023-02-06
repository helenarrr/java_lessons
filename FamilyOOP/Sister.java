package FamilyOOP;

class Sister extends Human implements Mother, PetOwner {
    private String SisAndBro;
    public String getSisAndBro() {return SisAndBro;}

    @Override
    int go(int steps) {
        int start = 0;
        int move = start + steps;
        return move;
    }
    @Override
    void showFamilyStatus() {
        int age = getAge();
        String status = getFamilyStatus();
        String ch = getHavingChildren();
        String sandb = getSisAndBro();
        System.out.printf("Человек в возрасте: %d лет. Семейное положение: %s. Дети: %s. Братья/Сестры : %s", age, status, ch, sandb);
    }
    @Override
    public void cleanHome(int effort) {
        if (effort < 100 && effort > 50) {System.out.println("Идеальная уборка!");}
        else if (effort < 50 && effort > 20) {System.out.println("Хорошо постарались");}
        else if (effort < 20 && effort > 0) {System.out.println("Плохо!");}
        else System.out.println("Какая-то ошибка...");
    }
    @Override
    public void bringUpChildren() {
        System.out.println("Не балуйся!");
    }

    @Override
    public void call() {
        System.out.println("Иди сюда!");
    }

}
