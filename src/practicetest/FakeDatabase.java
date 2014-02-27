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
public class FakeDatabase implements DataStrat{
    private Customer[] customers;
    private Product[] products;
    
    //@Override
    public Product findProduct(String prodId){
        for(int i = 0; i < products.length; i++){
            if(products[i].getProdId().equals(prodId)){
                return products[i];
            }
        }
        return null;
    }
    
    //@Override
    public Customer findCustomer(String custId){
        for(int i = 0; i < customers.length; i++){
            if(customers[i].getCustId().equals(custId)){
                return customers[i];
            }
        }
        return null;
    }
}
