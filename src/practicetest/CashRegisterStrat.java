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
public class CashRegisterStrat implements RegisterStrat{
    private DataStrat data;
    private Receipt receipt;
    
    public void printReceipt(){
        //receipt.printReceipt();
    }
    
    public void addItem(Product p, double quantity){
        receipt.addToLineItems(new LineItem(p, quantity));
    }
    
}
