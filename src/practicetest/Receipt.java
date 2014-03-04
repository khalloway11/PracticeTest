/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicetest;
import java.util.Date;

/**
 *
 * @author khalloway
 */
public class Receipt {
    private Customer customer;
    private LineItem[] lineItems;
    private OutputStrategy output;
    private Date dateOfSale;
    
    public Receipt(Customer customer){
        this.setCustomer(customer);
        lineItems = new LineItem[0];
        dateOfSale = new Date();
    }
    
    public void addToLineItems(LineItem item){
        if(lineItems.length == 0){
            lineItems = new LineItem[1];
            lineItems[0] = item;
        } else {
            LineItem[] temp = new LineItem[lineItems.length +1];
            System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
            temp[lineItems.length] = item;
            lineItems = temp;
        }
    }
    
    public void printReceipt(){
        output.printOutput(customer, lineItems, dateOfSale);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
}
