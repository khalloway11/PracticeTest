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
public class Receipt {
    private Customer customer;
    private LineItem[] lineItems;
    
    public Receipt(Customer customer){
        this.setCustomer(customer);
        lineItems = new LineItem[0];
    }
    
    public void addToLineItems(LineItem item){
        LineItem[] temp = new LineItem[lineItems.length +1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        temp[lineItems.length] = item;
        lineItems = temp;
    }
    
    public void printReceipt(){
        double price;
        double quantity;
        for(LineItem lineitem: lineItems){
            price = lineitem.getProduct().getPrice();
            quantity = lineitem.getQuantity();
            System.out.print(lineitem.getProduct().getProdId() + "/t");
            System.out.print(lineitem.getProduct().getProdDescription() + "/t");
            System.out.print(price + "/t");
            System.out.print(quantity + "/t");
            System.out.print((price * quantity) + "/t");
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }
    
    
}
