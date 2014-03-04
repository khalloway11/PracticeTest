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
public class RealDatabase implements DataStrat{
    private Customer[] customers;
    private Product[] products;
    
    public RealDatabase(){
        customers = new Customer[0];
        products = new Product[0];
    }
    
    public void addProduct(Product p){
        if(products.length == 0){
            products = new Product[1];
            products[0] = p;
        } else {
            Product[] temp = new Product[products.length +1];
            System.arraycopy(products, 0, temp, 0, products.length);
            temp[products.length] = p;
            products = temp;
            temp = null;
        }
        
    }
    
    public void addCustomer(Customer c){
        if(customers.length == 0){
            customers = new Customer[1];
            customers[0] = c;
        } else {
            Customer[] temp = new Customer[customers.length +1];
            System.arraycopy(customers, 0, temp, 0, customers.length);
            temp[customers.length] = c;
            customers = temp;
            temp = null;
        }
    }
    
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
