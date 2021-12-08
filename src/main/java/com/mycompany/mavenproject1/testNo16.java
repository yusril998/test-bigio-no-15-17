/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author mochamadyusrilfahmiilhamfikri
 */
public class testNo16 {
       public static void main(String args[]) {
        int row = 5;
        for (int n = 1; n <= row; n++) {

            for (int m = 1; m <= row; m++) {
                if (m > n) {
                    System.out.print(" ");
                } else {
                    System.out.print(m);
                }

            }
            for (int m = row; m >= 1; m--) {
                if (m == row) {
                    System.out.print("");
                } else if (m > n) {

                    System.out.print(" ");
                } else {
                    System.out.print(m);
                }

            }
            System.out.println();

        }

        for (int n = row; n >= 1; n--) {
            if (n == row) {

            } else {
                for (int m = 1; m <= row; m++) {
                    if (m > n) {
                        System.out.print(" ");
                    } else {
                        System.out.print(m);
                    }

                }
                for (int m = row; m >= 1; m--) {
                    if (m == row) {
                        System.out.print("");
                    } else if (m > n) {

                        System.out.print(" ");
                    } else {
                        System.out.print(m);
                    }

                }
                System.out.println();
            }

        }

    }


}
