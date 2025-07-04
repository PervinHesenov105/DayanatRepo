/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.myschool.service;

import az.myschool.config.Base;
import java.util.Scanner;

/**
 *
 * @author Perfect
 */
public class MenuLoginService implements MenuService {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username:");
        String username = sc.next();
        System.out.println("Enter Password:");
        String password = sc.next();
        
        
        if(!(username.equals("admin1") && password.equals("1234"))){
            throw new IllegalArgumentException("USERNAME OR PASSWORD INVALID");
        }
        
        Base.loggedIn=true;
    }

}
