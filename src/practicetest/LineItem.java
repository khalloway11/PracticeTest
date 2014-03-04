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
public class LineItem {
    private Product product;
    private double quantity;
    private double subtotal;
    
    public LineItem(Product p, double quantity){
        this.setProduct(p);
        this.setQuantity(quantity);
        this.calculateSubtotal();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }
    
    public void calculateSubtotal() {
        this.subtotal = product.getProdDiscountedPrice(quantity);
    }
    
    
}
