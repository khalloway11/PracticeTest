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
public class PercentDiscountStrat implements DiscountStrat{
    private double discountPercent;
    
    public PercentDiscountStrat(double percent){
        setDiscountPercent(percent);
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = (discountPercent/100);
    }
    
    @Override
    public double getDiscountedPrice(double price, int quantity){
        return (price * quantity) * (1 - discountPercent);
    }
    
    @Override
    public double getAmountSaved(double price, int quantity){
        return (price * quantity) * discountPercent;
    }
}
