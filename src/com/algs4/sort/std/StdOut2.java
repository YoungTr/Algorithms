package com.algs4.sort.std;

import edu.princeton.cs.algs4.StdOut;

public class StdOut2 {
    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i > 50) break;
            StdOut.print(a[i]);
            StdOut.print(" ");
        }
        StdOut.println();
    }
}
