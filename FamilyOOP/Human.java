package FamilyOOP;

/**Абстрактный класс человек*/
abstract class Human{
    private int age;
    private String gender;
    private String familyStatus;
    private  String havingChildren;
    private String colorHair;
    public int getAge() {return age;}
    public String getFamilyStatus() {return familyStatus;}
    public String getHavingChildren() {return havingChildren;}
    abstract int go(int start);

    /**Метод, показывающий семейный стутус каждого члена семьи, а именно выводит семейное положение, наличие детей и дополнительно возраст*/
    void showFamilyStatus() {
        int age = getAge();
        String status = getFamilyStatus();
        String ch = getHavingChildren();
        System.out.printf("Человек в возрасте: %d лет. Семейное положение: %s. Дети: %s", age, status, ch);
    }
}
