/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicetest;

/**
 *
 * @author khalloway
 */
public interface DiscountStrat {
    public abstract double getDiscountedPrice(double price, double quantity);
    public abstract double getAmountSaved(double price, double quantity);
}
