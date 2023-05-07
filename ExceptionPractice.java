import java.util.ArrayList;

public class ExceptionPractice {

    public static void methodOne(int[] arr, int el) {
        if (el > arr.length - 1) {
            throw new RuntimeException("Вы вышли за границу массива!!!");
        }

        System.out.println(arr[el]);
    }


    public static void methodTwo(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length];

        for (int i = 0; i < arr3.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Делить на ноль нельзя!!!");
            }
            arr3[i] = arr1[i] / arr2[i];
            System.out.print(arr3[i] + " ");
        }

    }

    public static void methodThree(ArrayList<Integer> array, Integer el) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.remove(el);
        System.out.println("Удалено");
        if (array.isEmpty()) {
            throw new RuntimeException("Массив пустой, удалять нечего!");
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 3, 6, 3, 10, 0};
        int[] arr2 = {2, 4, 7, 1, 6, 0};
        ArrayList<Integer> arr = new ArrayList<>();

        methodOne(arr1, 1); // первый метод
        methodTwo(arr1, arr2); // второй метод
        methodThree(arr, 2); // третий метод


    }

}


