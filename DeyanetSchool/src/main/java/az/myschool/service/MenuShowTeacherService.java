/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.myschool.service;

import az.myschool.bean.Teacher;
import az.myschool.config.Base;

/**
 *
 * @author Perfect
 */
public class MenuShowTeacherService implements MenuService {

    @Override
    public void process() {
       for(Teacher s : Base.instance().getTeachers()){
            System.out.println(s);
        }
    }
}
