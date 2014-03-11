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
    
    public FakeDatabase(){
        customers = new Customer[3];
        products = new Product[3];
        
        customers[0] = new Customer("0001", "John", "Doe");
        customers[1] = new Customer("0002", "Steve", "Blum");
        customers[2] = new Customer("0003", "Michael", "Scott;");
        
        products[0] = new Product("A001", "Leather Jacket", 45.99, null);
        products[1] = new Product("A021", "Baseball Bat", 29.99, new PercentDiscountStrat(20.0));
        products[2] = new Product("B105", "Rice Cooker", 35.00, new FlatDiscountStrat(8.0));
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
}
