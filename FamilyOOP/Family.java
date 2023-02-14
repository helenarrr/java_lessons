package FamilyOOP;

import java.util.ArrayList;
import java.util.List;

class Family<T> {
    List<T> family;

    Family() {
        family = new ArrayList<>();
    }
    void add(T name) {
        family.add(name);
    }

    @Override
    public String toString() {
        return String.format("%s", family);
    }
}
