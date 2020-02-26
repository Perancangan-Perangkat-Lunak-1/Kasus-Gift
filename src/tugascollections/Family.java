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


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Family {
    
    private Set<Niece> nieceSet;
    private Set<Uncle> uncleSet;
    static private Set<String> presentSet;
    
    public Family() {
        nieceSet = new TreeSet<Niece>();
        uncleSet = new TreeSet<>(new UncleNameComp());
        presentSet = new HashSet<>();
    }
    
    public boolean addNiece(String name, int day, int month) {
        DayMonth date = new DayMonth();
        date.setDay(day);
        date.setMonth(month);
        
        Niece e = new Niece();
        e.setName(name);
        e.setDm(date);
        
        return nieceSet.add(e);
    }
    
    public boolean addUncle(String name) {
        Uncle u = new Uncle();
        
        u.setName(name);
        
        return uncleSet.add(u);
    }
    
    //how to remove temporary object
    public Niece findNiece(String name) {
        for (Niece n : nieceSet){
            if(n.getName().equals(name))
                return n;
        }
        return null;    
    }
    
    public Uncle findUncle(String name) {
        for (Uncle u : uncleSet){
            if(u.getName().equals(name))
                return u;
        }
        return null; 
    }
    
    public void listNieces() {
        nieceSet.forEach(System.out::println);
    }
    
    public void listUncles() {
        uncleSet.forEach(System.out::println);
    }

    /**
     *
     * @param desc
     * @return
     */
    public boolean isPresentExist(String desc) {
        if(presentSet.contains(desc)) {
            System.out.println(desc + " has been given by another uncle.");
        }
        return presentSet.contains(desc);
    }
    
    public void addPresent(String present) {
        presentSet.add(present);
    }
    
    public void getMenu() {
        System.out.println("\n              M E N U           ");
        System.out.println("1. Add Uncle");
        System.out.println("2. Add Niece/Nephew");
        System.out.println("3. Add Present");
        System.out.println("4. List of Uncle");
        System.out.println("5. List of Niece/Nephew");
        System.out.println("6. List of Uncle Presents");
        System.out.println("7. List of Niece/Nephew Presents");
        System.out.println("8. Delete Presents");
        System.out.println("0. Exit");
        System.out.println("================================");
    }
}
