package com.estesjorie;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        int[] numbers1 = {2, 3, 5, 1, 4};
        System.out.println(numbers1.length);

        // Multi-Dimensional Arrays //

        int[][] numbers2D = new int[2][3];
        numbers2D[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers2D));

        int [][] numbers2D1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(numbers2D1));

    }
}
