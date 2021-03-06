/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import static com.mycompany.mavenproject1.testNo17.findZigZagSequence;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mochamadyusrilfahmiilhamfikri
 */
public class NewClass {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int test_cases = kb.nextInt();
        for (int cs = 1; cs <= test_cases; cs++) {
            int n = kb.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }
            findZigZagSequence(a, n);
        }
    }

    public static void findZigZagSequence(int[] a, int n) {
        Arrays.sort(a);
        int mid = ((n - 1) / 2);// berubah
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2; // berubah


        while (st < ed) {
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 2; // berubah
        }
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(a[i]);
        }
        System.out.println();
    }

}
