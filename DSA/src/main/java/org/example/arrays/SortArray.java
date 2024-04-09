package org.example.arrays;

import javax.sound.midi.SysexMessage;

public class SortArray {

    public void sortArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public void swap(int[] arr, int number1, int number2) {
        int temp = arr[number1];
        arr[number1] = arr[number2];
        arr[number2] = temp;
    }


    // 5 4 3 2 1  -> 45321
}
