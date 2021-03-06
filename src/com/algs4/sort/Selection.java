/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

package com.algs4.sort;

import edu.princeton.cs.algs4.StdOut;

public class Selection {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i; j < N; j++)
                if (less(a[j], a[min]))
                    min = j;
            exch(a, min, i);
        }
    }

    public static boolean less(Comparable v, Comparable m) {
        return v.compareTo(m) < 0;
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }

        return true;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }


    public static void main(String[] args) {
        Integer[] a = {
                1, 3, 5, 62, 524, 72, 54, 57, 72, 41, 67, 17, 416, 86,
                426, 789, 26, 95, 41, 61, 416, 8, 965, 41, 516, 89, 315,
                80, 315, 90, 41, 567
        };
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
