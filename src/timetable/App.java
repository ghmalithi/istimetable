
package timetable;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author Malintha
 */
public class App {

    private static App app;
    private List<StudentClass> classes;
    private List<Subject> subjects;
    
    public App() {

        classes = new ArrayList<StudentClass>() {
            @Override
            public boolean contains(Object o) {
                int i = indexOf(o);
                if (i >= 0) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public int indexOf(Object o) {
                String name = ((String) o).split(":")[0];
                for (int i = 0; i < size(); i++) {
                    if (get(i).toString().split(":")[0].equals(name)) {
                        return i;
                    }
                }
                return -1;
            }
        };
      
        subjects = new ArrayList<Subject>() {
            @Override
            public boolean contains(Object o) {
                int i = indexOf(o);
                if (i >= 0) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public int indexOf(Object o) {
                String code = ((String) o).split(":")[0];
                for (int i = 0; i < size(); i++) {
                    if (get(i).toString().split(":")[0].equals(code)) {
                        return i;
                    }
                }
                return -1;
            }
        };
        
    }

    private static App _getinstance() {
        if (app == null) {
            app = new App();
        }
        return app;
    }

    public static List<StudentClass> getClasses() {
        return _getinstance().classes;
    }

    public static List<Subject> getSubjects(){
        return _getinstance().subjects;
    }
    
}
