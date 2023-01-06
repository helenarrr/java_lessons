package ru.geekbrains;

public class methods {
    static int[][] createRoutes(int from, int to) {
        int[][] routes = new int[2][to - from + 1];
        routes[0][0] = from;
        routes[1][0] = 1;

        for (int i = 0; i < routes.length; i++) {
            for (int j = 1; j < routes[i].length; j++) {
                if (i == 0)
                    routes[i][j] = routes[i][j - 1] + 1;
                else {
                    routes[i][j] = routes[i][j - 1];
                    // если число в первой строке четное и его половина больше стартового значения
                    if (routes[i - 1][j] % 2 == 0 && routes[i - 1][j] / 2 >= from)
                        routes[i][j] += routes[i][routes[i - 1][j] / 2 - from];
                }
            }
        }
        return routes;
    }

    static int getNumberRoutes(int[][] array) {
        return array[1][array[0].length - 1];
    }

    static void show2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d \t", array[i][j]);
            }
            System.out.println();
        }
    }

}
