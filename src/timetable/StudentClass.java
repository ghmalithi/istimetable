
package timetable;

/**
 *
 * @author Malintha 
 */
public class StudentClass {
    private String name;
    private int studentcount;

    public StudentClass(String name, int studentcount) {
        this.name = name;
        this.studentcount = studentcount;
    }
    
    public String getName() {
        return name;
    }

    public int getStudentcount() {
        return studentcount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentcount(int studentcount) {
        this.studentcount = studentcount;
    }
   
    
    @Override
    public String toString(){
        return name +": "+studentcount;
    }
    
}
