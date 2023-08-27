package com.teachmeskills.lesson8.task3.model;

import java.util.Arrays;

public class Data {
    //methods
    //show matrix
    public static void showMatrix(int[][] matrix){
        System.out.println(Arrays.deepToString(matrix));
    }
    //multiply matrices
    public static void multiplyMatrices(int[][] m1, int[][] m2) {
        int[][] resultM = new int[m1.length][m2[0].length];

        for (int i = 0; i < resultM.length; i++) {
            for (int j = 0; j < resultM[0].length; j++) {
                for (int k = 0; k < resultM[0].length; k++) {
                    resultM[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(resultM));
    }
}
