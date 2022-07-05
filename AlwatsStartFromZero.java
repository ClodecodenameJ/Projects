/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaypractice;

import java.util.*;

public class AlwatsStartFromZero {

    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.print("Number of turns: ");
        int temp = sk.nextInt();
        int temp1 = 0;
        if (temp > 12) {
            temp1 = temp % 12;
        } else if (temp < 0) {
            if (temp < -12) {
                temp1 = temp % -12;
                temp1 += 12;
            } else {
                temp1 = temp + 12;
            }
        } else {
            temp1 = temp;
        }
        System.out.println("");
        System.out.println("Output: " + temp1);
    }
}
