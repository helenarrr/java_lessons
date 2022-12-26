import java.util.HashMap;
import java.util.Map;

public class methods {
    static Map init(int[] a) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int x: a) {
            int newValue = counter.getOrDefault(x, 0) + 1;
            counter.put(x, newValue);
        }
        return counter;
    }

    static void showCounter(Map<Integer, Integer> counter) {
        for (Map.Entry<Integer, Integer> a : counter.entrySet()) {
            System.out.printf("%d - встречается %d раз\n", a.getKey(), a.getValue());
        }
    }
}
