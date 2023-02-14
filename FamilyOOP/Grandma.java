package FamilyOOP;

class Grandma extends Sister {
    String name;
    Grandma(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
