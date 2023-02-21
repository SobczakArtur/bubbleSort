package com.sobczak.artur;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // the program sort content array use bubble sort

        Scanner scanner = new Scanner(System.in);
        System.out.println("What size is your array? \nMust be even.");
        int arraySize = scanner.nextInt();

        FillArray fillArray = new FillArray();
        int[] unsortedArray = fillArray.fillArrayMethod(arraySize);
      //  System.out.println(Arrays.toString(unsortedArray));

        BubbleSort bubbleSort = new BubbleSort();
        int[] sortArray = bubbleSort.bubbleSortMethod(unsortedArray, arraySize);
        System.out.println(Arrays.toString(sortArray));

    }
}
