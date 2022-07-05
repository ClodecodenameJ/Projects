package jaypractice;

import javax.swing.*;

public class SumAndMultiplying {

    public static double AddSum(double n1, double n2) {
        double temp1 = n1, temp2 = 0;
        if (n1 > 0) {

            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < 10; j++) {
                    if (n2 == ((n1 - temp2) * temp2) && ((n1 - temp2) + temp2) == n1) {

                        return (n1 - temp2);
                  
                    }
                    temp2 += 0.1;
                }
            }
        } else if (n1 < 0) {
            temp1 = n1;
            temp2 = 0;
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < 10; j++) {
                    if (n2 == ((n1 - temp2) * temp2) && ((n1 - temp2) + temp2) == n1) {

                        return (n1 - temp2);

                    }
                    temp2 -= 0.1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("enter sum"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("enter product"));

        double n3 = n1 - AddSum(n1, n2);
        System.out.println("the two numbers are " + AddSum(n1, n2) + "and " + n3);

    }
}
