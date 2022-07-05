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
public class Dispenser {

    private int numberOfItems;
    private int cost;

    public Dispenser() {
        numberOfItems = 50;
        cost = 50;
    }

    public Dispenser(int setNoOfItems, int setCost) {
        if (setNoOfItems >= 0) {
            numberOfItems = setNoOfItems;
        } else {
            setNoOfItems = 50;
        }
        if (setCost >= 0) {
            cost = setCost;
        } else {
            cost = 50;
        }
    }

    public int getCount() {
        return numberOfItems;
    }

    public int getProductCost() {
        return cost;
    }

    public void makeSale() {
        numberOfItems--;
    }
}
