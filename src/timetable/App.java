/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * added/
package timetable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class App {

    private static App app;
    private List<StudentClass> classes;

    public App() {
        classes = new ArrayList<>();
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
}
