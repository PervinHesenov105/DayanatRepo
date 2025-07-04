/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.myschool.config;

import az.myschool.bean.Student;
import az.myschool.bean.Teacher;
import az.myschool.util.FileUtil;
import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author Perfect
 */
public class Base implements Serializable {

    private LinkedList<Student> students = new LinkedList<>();
    private LinkedList<Teacher> teachers = new LinkedList<>();
    public static Base base = null;
    public static boolean loggedIn;

    public static void save() {
        FileUtil.writeObjectToFile(Base.instance(), "app.obj");
    }

    public static void initialize() {
        Object obj = FileUtil.readObjectFromFile("app.obj");
        if (obj instanceof Base) {
            base = (Base) obj;
        }

    }

    public static Base instance() {
        if (base == null) {
            base = new Base();
        }
        return base;
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(Student s) {
        this.students.add(s);
    }

    public LinkedList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher t) {
        this.teachers.add(t);
    }

}
