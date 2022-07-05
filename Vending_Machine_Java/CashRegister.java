/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author romua
 */
public class CashRegister {

    private int cashOnHand;

    public CashRegister() {
        cashOnHand = 500;

    }

    public CashRegister(int cashIn) {
        if (cashIn >= 0) {
            cashOnHand = cashIn;
        } else {
            cashOnHand = 500;
        }
    }

    public int CashRegister(int cashIn) {
        return cashIn;
    }

    public void acceptedAmount(int amountIn) {
        cashOnHand += amountIn;
    }

    public int currentBalance() {
        return cashOnHand;
    }

 

    

}
