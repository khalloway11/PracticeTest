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
public interface OutputStrategy {
    public abstract void printOutput(Customer c, LineItem[] l, Date d);
}
