package com.teachmeskills.lesson8.task3;

import com.teachmeskills.lesson8.task3.model.Data;

public class Runner {
    public static void main(String[] args) {
        int[][] Array1 = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] Array2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};

        Data.showMatrix(Array1);
        Data.showMatrix(Array2);
        Data.multiplyMatrices(Array1, Array2);
    }
}
