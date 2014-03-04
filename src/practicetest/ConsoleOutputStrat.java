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
public class ConsoleOutputStrat implements OutputStrategy {
    public void printOutput(Customer c, LineItem[] l, Date d){
        System.out.println(c.getCustId() + "\t" + c.getFirstName() + "\t" + c.getLastName());
        //System.out.println("Date of sale: " + d.toString());
        for(LineItem item : l){
            System.out.println(item.getProduct().getProdId() + "\t" + item.getProduct().getProdDescription() + "\t" + item.getQuantity() + "\t" + item.getAmtSaved() + "\t" + item.getSubtotal());
        }
    }
}
