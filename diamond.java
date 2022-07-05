/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaypractice;

import javax.swing.*;

public class diamond {

    public static void main(String[] args) {

        int NumberOfStarInitor = Integer.parseInt(JOptionPane.showInputDialog("input integer"));

        for (int i = 0; i < NumberOfStarInitor; i++) {
            for (int j = i; j < NumberOfStarInitor; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *  ");
            }
            System.out.println("");
        }
        for (int i = 0; i < NumberOfStarInitor - 2; i++) {
            System.out.print("    ");
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i + 2; j < NumberOfStarInitor; j++) {
                System.out.print(" *  ");
            }
            System.out.println("");
        }
    }

}
