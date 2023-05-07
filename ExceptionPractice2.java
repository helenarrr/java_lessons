public class ExceptionPractice2 {

//    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//    каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//    Если длины массивов не равны, необходимо как-то оповестить пользователя.


//  Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//  Если длины массивов не равны, необходимо как-то оповестить пользователя.
//  Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

    public static void usingArray1(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];

        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны!!!");
        }
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i] - arr2[i];
            System.out.print(arr3[i] + " ");
        }

    }

    public static void usingArray2(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];

        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны!!!");
        }
        for (int i = 0; i < arr3.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Делить на ноль нельзя!!!");
            }
            arr3[i] = arr1[i] / arr2[i];
            System.out.print(arr3[i] + " ");

        }
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 6, 4, 6, 9};
        int[] arr2 = {4, 6, 6, 8, 0, 8};


        usingArray1(arr1, arr2); // первый метод
//        usingArray2(arr1, arr2); // второй  метод
    }

}
