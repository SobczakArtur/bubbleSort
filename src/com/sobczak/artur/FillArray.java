package com.sobczak.artur;

import java.util.Arrays;
import java.util.Scanner;

public class FillArray {

    protected int[] fillArrayMethod(int arraySize) {

        Scanner scanner = new Scanner(System.in);
        // take size array from user
        System.out.println("Plese give number to array: ");
        int [] unsortArray = new int[arraySize];
        // fill array by number taken from user
        for (int i = 0; i < unsortArray.length; i++) {
            int numberToArray = scanner.nextInt();
            unsortArray[i] = numberToArray;
        }
        return unsortArray;
    }

}