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
public class ConsoleOutputStrat {
    public void printOutput(Customer c, LineItem[] l){
        System.out.println(c.getCustId() + "\t" + c.getFirstName() + "\t" + c.getLastName());
        for(LineItem item : l){
            System.out.println(item.getProduct().getProdId() + "\t" + item.getProduct().getProdDescription() + "\t" + item.getQuantity() + "\t" + item.getAmtSaved() + "\t" + item.getSubtotal());
        }
    }
}
