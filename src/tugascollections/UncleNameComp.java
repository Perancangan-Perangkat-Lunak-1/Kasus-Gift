/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascollections;

/**
 *
 * @author ACER
 */
import java.util.Comparator;


public class UncleNameComp implements Comparator<Uncle>{
    
    @Override
    public int compare(Uncle u1, Uncle u2) {
        return u1.getName().compareTo(u2.getName());
    }
}
