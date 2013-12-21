/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

/**
 *
 * @author Malintha
 */
public class Subject {

    private String name;
    private String code;
    private StudentClass toClass;
    private int slots;

    public Subject(String name, String code, StudentClass toClass, int slots) {
        this.name = name;
        this.code = code;
        this.toClass = toClass;
        this.slots = slots;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getSlots() {
        return slots;
    }

    public StudentClass getToClass() {
        return toClass;
    }

    @Override
    public String toString() {
        return code+":" + name +" For: "+toClass.getName() + " Slots: "+getSlots();
    }
    
    
}
