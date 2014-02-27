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
public interface DataStrat {
    public abstract Product findProduct(String prodId);
    public abstract Customer findCustomer(String custId);
}
