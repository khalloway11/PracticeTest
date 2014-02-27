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
public class FlatDiscountStrat implements DiscountStrat{
    private double discountRate;
    
    public FlatDiscountStrat(double rate){
        this.setDiscountRate(rate);
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    public double getDiscountedPrice(Product p, int quantity){
        return (p.getPrice() * quantity) - (quantity * this.getDiscountRate());
    }
    public double getAmountSaved(Product p, int quantity){
        return (quantity * this.getDiscountRate());
    }
}
