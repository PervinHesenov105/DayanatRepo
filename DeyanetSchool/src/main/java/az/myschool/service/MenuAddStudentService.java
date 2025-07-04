/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.myschool.service;

import az.myschool.bean.Student;
import az.myschool.config.Base;
import az.myschool.util.FileUtil;
import java.util.Scanner;

/**
 *
 * @author Perfect
 */
public class MenuAddStudentService implements MenuService {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter surname:");
        String surname = sc.next();
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        Base.instance().setStudents(s);
        Base.save();
        
    }
}
