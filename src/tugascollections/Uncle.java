package tugascollections;

import java.util.HashMap;
import java.util.Map;


public class Uncle extends Person {
    
    private HashMap<String,Niece> givenPresent = new HashMap<>();
    
    public boolean addPresent(Niece receipent, String desc) {
        receipent.addPresent(desc, this);
        return givenPresent.put(desc, receipent)!=null;
    }
    
    public void listPresents() {
        for (Map.Entry<String,Niece> entry : givenPresent.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + " received by " + value);
        }
    }
    
    @Override
    public String toString() {
        return name;
    }

    
}