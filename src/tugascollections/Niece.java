package tugascollections;

import java.util.HashMap;
import java.util.Map;


public class Niece extends Person implements Comparable<Niece> {    
    private DayMonth dm;
    private HashMap<String,Uncle> receivedPresent = new HashMap<>();

    /**
     * @return the dm
     */
    public DayMonth getDm() {
        return dm;
    }

    /**
     * @param dm the dm to set
     */
    public void setDm(DayMonth dm) {
        this.dm = dm;
    }

    /**
     * @return the presentList
     */
    public HashMap<String,Uncle> getPresentList() {
        return receivedPresent;
    }

    /**
     * @param u
     * @param desc
     */
    public void addPresent(String desc, Uncle u) {
        receivedPresent.put(desc,u);
    }

    public void listPresents() {
        for (Map.Entry<String,Uncle> entry : receivedPresent.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + " given by uncle " + value);
        }
    }
    
    public int clearPresents() {
        int size = receivedPresent.size();
        receivedPresent.clear();
        return size;
    }
    
    @Override
    public String toString() {
        return name + "( " + dm + " )";
    }

    @Override
    public int compareTo(Niece o) {
        return name.compareTo(o.getName());
    }
}
