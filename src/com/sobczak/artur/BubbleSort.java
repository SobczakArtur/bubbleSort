package com.sobczak.artur;

public class BubbleSort {
    int temp;

    protected int[] bubbleSortMethod(int[] fillArray, int arraySize) {
        boolean flag = true;
        // this method does the sorting
//        for (int i = 0; i < arraySize; i++) {
        while (flag == true){
            flag = false;
            for (int j = 0; j < arraySize - 1; j++) {
                if (fillArray[j] > fillArray[j + 1]) {
                    temp = fillArray[j];
                    fillArray[j] = fillArray[j + 1];
                    fillArray[j + 1] = temp;
                    flag = true;
                }
            }
        }
        return fillArray;
    }
}
