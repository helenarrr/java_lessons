package Family;

class Human{
    private int age;
    private String gender;
    private String familyStatus;
    private  String havingChildren;
    private String colorHair;

    Human(int age, String familyStatus, String havingChildren) {
        this.age = age;
        this.familyStatus = familyStatus;
        this.havingChildren = havingChildren;
    }

    Human(int age, String gender)  {
        this.age = age;
        this.gender = gender;
    }

    Human(int age, String familyStatus, String havingChildren, String colorHair) {
        this(age,familyStatus, havingChildren);
        this.colorHair = colorHair;

    }

    public int getAge() {return age;}
    public String getGender() {return gender;}
    public String getFamilyStatus() {return familyStatus;}
    public String getHavingChildren() {return havingChildren;}
    public String getColorHair() {return colorHair;}
    public void setAge(int age) {this.age = age;}
    public void setGender(String gender) {this.gender = gender;}
    public void setFamilyStatus(String familyStatus) {this.familyStatus = familyStatus;}
    public void setHavingChildren(String havingChildren) {this.havingChildren = havingChildren;}
    public void setColorHair(String colorHair) {this.colorHair = colorHair;}
    void showFamilyStatus() {
        int age = getAge();
        String status = getFamilyStatus();
        String ch = getHavingChildren();
        System.out.printf("Человек в возрасте: %d лет. Семейное положение: %s. Дети: %s", age, status, ch);
    }
}

class Father extends Human {
    Father(int age, String familyStatus, String colorEye, String havingChildren, String havingBrothersAndSisters) {
        super(age, familyStatus, havingChildren);
        setColorEye(colorEye);
        setHavingBrothersAndSisters(havingBrothersAndSisters);
    }
    private String colorEye;
    private String havingBrothersAndSisters;

    public void setColorEye(String colorEye) {this.colorEye = colorEye;}
    public void setHavingBrothersAndSisters(String havingBrothersAndSisters) {this.havingBrothersAndSisters = havingBrothersAndSisters;}

    public String getColorEye() {return colorEye;}
    public String getHavingBrothersAndSisters() {return havingBrothersAndSisters;}
}

class Mother extends Human {
    Mother(int age, String familyStatus, String havingChildren, String colorHair, String education){
        super(age, familyStatus, havingChildren, colorHair);
        this.education = education;
    }
    Mother(int age, String gender) {
        super(age, gender);
    }
    private String education;

    public void setEducation(String education) {this.education = education;}
    public String getEducation() {return education;}

    void voice(String name) {
        System.out.println(name + " иди есть суп");
    }

}

class Children extends Mother {
    Children(String name, int age, String gender, String parents) {
        super(age, gender);
        this.parents = parents;
        this.name = name;
    }
    private String parents;
    private String name;
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
    public void setParents(String parents) {this.parents = parents;}
    public String getParents() {return parents;}

}


class Family {
    public static void main(String[] args) {
        Father father = new Father(45, "не женат", "голубые глаза", "1 ребенок", "нет сестер");
        Mother mother = new Mother(34, "не замужем", "1 ребенок", "рыжые волосы", "высшее");
        Children children1 = new Children("Степан", 12, "мужской", "Лев и Марина");
        Children children2 = new Children("Дмитрий", 18, "мужской", "Леонид и Марина");

        mother.setHavingChildren("2 ребенка");

        mother.voice("Степан,");
        children1.goEat();
        father.showFamilyStatus();
    }

}