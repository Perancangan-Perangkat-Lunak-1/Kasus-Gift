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
public class DayMonth {
    private int day;
    private int month;

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }
    
    /**
     *
     * @param dm1
     * @param dm2
     * @return
     */
    public static boolean isYounger(DayMonth dm1, DayMonth dm2) {
        if (dm1.getMonth() < dm2.getMonth()) {
            return true;
        } else if (dm1.getMonth() == dm2.getMonth()) {
            if (dm1.getDay() < dm2.getDay()) {
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return "day " + day + ", month " + month;
    }
}
