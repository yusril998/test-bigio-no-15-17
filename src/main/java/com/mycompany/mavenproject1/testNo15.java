/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author mochamadyusrilfahmiilhamfikri
 */
public class testNo15 {
     public static void main(String[] args) throws java.lang.Exception {
        System.out.println("-- input jumlah kali input -- ");
        Scanner kb = new Scanner(System.in);
        System.out.println("--------- ");
        int test_cases = kb.nextInt();
        System.out.println("--------- ");
        String ret = "";
        for (int cs = 1; cs <= test_cases; cs++) {
            String a = kb.next();
            ret = ret + a;
        }
        String ret2 = "";
        for (int str = (ret.length() - 2); str >= 0; str--) {
            ret2 = ret2 + ret.charAt(str);
        }
        System.out.println("--------- ");
        System.out.println(ret + ret2);
    }
}
