/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

package com.algs4.sort;

import edu.princeton.cs.algs4.StdOut;

import com.algs4.sort.std.*;

import java.util.Arrays;

public class SortCompare {

    public static double time(String alg, Comparable[] a) {
        StopWatch timer = new StopWatch();
        if ("Insertion".equals(alg)) {
            Insertion.sort(a);
        }

        if ("InsertionGuardEx24".equals(alg)) {
            InsertionGuardEx24.sort(a);
        }

        if ("InsertionEx25".equals(alg)) {
            InsertionGuardEx24.sort(a);
        }

        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, Integer[] a, int T) {
        double total = 0.0;
        for (int t = 0; t < T; t++) {
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        String alg3 = args[2];
        int N = Integer.parseInt(args[3]);
        int T = Integer.parseInt(args[4]);

        StdOut.println("N = " + N);
        StdOut.println("T = " + T);

        Integer[] a1 = StdRandom2.generateRandomArray(N, -10000, 10000);
        Integer[] a2 = Arrays.copyOf(a1, a1.length);
        Integer[] a3 = Arrays.copyOf(a1, a1.length);

        StdOut2.show(a1);
        StdOut2.show(a2);
        StdOut2.show(a3);

        double t1 = timeRandomInput(alg1, a1, T);
        double t2 = timeRandomInput(alg2, a2, T);
        double t3 = timeRandomInput(alg3, a3, T);
        StdOut.printf("%s , time = %f\n", alg1, t1);
        StdOut.printf("%s , time = %f\n", alg2, t2);
        StdOut.printf("%s , time = %f\n", alg3, t3);
        StdOut.printf("For %d random Doubles\n  %s is", N, alg1);
        StdOut.printf(" %.1f times faster than %s\n", t2 / t1, alg2);

        StdOut2.show(a1);
        StdOut2.show(a2);
        StdOut2.show(a3);

    }
}
