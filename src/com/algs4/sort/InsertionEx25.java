/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

package com.algs4.sort;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import com.algs4.sort.std.*;

public class InsertionEx25 {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            Comparable temp = a[i];
            int j = i;
            for (; j > 0 && less(temp, a[j - 1]); j--) {
                a[j] = a[j - 1];
            }
            a[j] = temp;
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
        Integer[] a = StdRandom2.generateRandomArray(10000, 0, 10000);
        StdOut2.show(a);
        StopWatch watch = new StopWatch();
        sort(a);
        double time = watch.elapsedTime();
        StdOut.println("time = " + time);
        assert isSorted(a);
        StdOut2.show(a);
    }
}
