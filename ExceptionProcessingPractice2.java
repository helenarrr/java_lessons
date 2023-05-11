public class ExceptionProcessingPractice2 {

    public static void someDo() {
        try {
            double[] array = {1, 13, 5, 6, 67, 0, 97, 5, 4, 1};
            int d = 0;
            double catchedRes1 = array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public static void main(String[] args) {
        someDo();
    }
}
