package org.example.recursion.Day1;

import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArrays {

    public void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        int[] c = new int[m + n];
        int k = 0;
        for (int i = 0; i < c.length; i++) {
            if (i < m) {
                c[i] = nums1[i];
            } else {
                if (k < n) {
                    c[i] = nums2[k];
                    k++;
                }
            }

        }
        Arrays.sort(c);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }
}
