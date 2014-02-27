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
    
    @Override
    public Product findProduct(String prodId){
        for (Product product : products) {
            if (product.getProdId().equals(prodId)) {
                return product;
            }
        }
        return null;
    }
    
    @Override
    public Customer findCustomer(String custId){
        for (Customer customer : customers) {
            if (customer.getCustId().equals(custId)) {
                return customer;
            }
        }
        return null;
    }
}
