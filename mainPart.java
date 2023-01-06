package ru.geekbrains;

//
// N ->
// / F(N-1) , N mod 2 != 0
// F(N) = { F(N-1) + F(N/2), N mod 2 = 0
// \ 1, N = 2
//
//


//    static int F(int a, int b) {
//        if (b == a)
//            return 1;
//        else if (b < a) {
//            return 0;
//        } else if (b % 2 != 0)
//            return F(a, b - 1);
//        else
//            return F(a, b - 1) + F(a, b / 2);
//    }
//} РЕКУРСИЯ

public class mainPart {
    public static void main(String[] args) {
        int startNum = 2;
        int finishNum = 7;

        int[][] routes = methods.createRoutes(startNum, finishNum);
        methods.show2dArray(routes);

        int numberRoutes = methods.getNumberRoutes(routes);

        System.out.printf("Количество возможных способов получить из числа %d число %d,\n", startNum, finishNum);
        System.out.printf("используя операции прибавления 1 и умножение на 2 равно %d", numberRoutes);
    }

}