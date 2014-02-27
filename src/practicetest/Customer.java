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
public class Customer {
    private String custId;
    private String firstName;
    private String lastName;
    //private Membership membership;
    
    public Customer(String custId, String firstName, String lastName){
        this.setCustId(custId);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }
    
//    public Customer(String custId, String firstName, String lastName, Membership member){
//        this.setCustId(custId);
//        this.setFirstName(firstName);
//        this.setLastName(lastName);
//        this.setMembership(member);
//    }
    
    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
//    public void setMembership(Membership member){
//        this.membership = member;
//    }
    
//    public Membership getMembership(){
//        return this.membership;
//    }
}
