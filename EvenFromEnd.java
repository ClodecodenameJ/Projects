/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaypractice;

/**
 *
 * @author romua
 */
import java.util.*;

public class EvenFromEnd {

    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.print("imput numbers: ");
        String str = sk.next();

        String[] arr = str.split(" ");

        for (String ss : arr) {
            System.out.println(ss);
        }

    }
}
