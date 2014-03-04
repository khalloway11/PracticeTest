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
public class Product {
    private String prodId;
    private String prodDescription;
    private double price;
    private DiscountStrat strat;
    
    public Product(String prodId, String prodDescription, double price, DiscountStrat strat){
        this.setProdId(prodId);
        this.setProdDescription(prodDescription);
        this.setPrice(price);
        this.setStrat(strat);
    }

    public DiscountStrat getStrat() {
        return strat;
    }

    public void setStrat(DiscountStrat strat) {
        this.strat = strat;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String ProdId) {
        this.prodId = ProdId;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String ProdDescription) {
        this.prodDescription = ProdDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getProdDiscountedPrice(double quantity){
        return strat.getDiscountedPrice(price, quantity);
    }
    
    public double getProdAmountSaved(double quantity){
        return strat.getAmountSaved(price, quantity);
    }
}
