/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.myschool.service;

import az.myschool.bean.Student;
import az.myschool.config.Base;

/**
 *
 * @author Perfect
 */
public class MenuShowStudentService implements MenuService {

    @Override
    public void process() {
        
        for(Student s : Base.instance().getStudents()){
            System.out.println(s);
        }
        
    }
}
