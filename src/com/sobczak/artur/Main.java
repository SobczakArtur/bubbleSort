package com.sobczak.artur;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // the program sort content array use bubble sort

        Scanner scanner = new Scanner(System.in);
        System.out.println("What size is your array? ");
        int arraySize = scanner.nextInt();

        FillArray fillArray = new FillArray();
        int[] sortedArray = fillArray.fillArrayMethod(arraySize);
        System.out.println(Arrays.toString(sortedArray));


//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.bubbleSortMethod();

    }
}
