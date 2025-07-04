/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.myschool.util;

import az.myschool.config.Base;
import az.myschool.menu.Menu;
import java.util.Scanner;

/**
 *
 * @author Perfect
 */
public class MenuUtil {

    public static void showMenu() {
        Menu m[] = Menu.values();

        for (int i = 0; i < m.length; i++) {
            if (m[i] != Menu.UNKNOWN) {
                if (m[i] == Menu.REGISTER || m[i] == Menu.LOGIN) {
                    if (!Base.loggedIn) {
                        System.out.println(m[i]);
                    }
                } else if (Base.loggedIn) {
                    System.out.println(m[i]);
                }
            }
        }
    }

    public static void startMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select menu:");
        MenuUtil.showMenu();
        int selectedNumber = sc.nextInt();
        Menu.findNumber(selectedNumber).enumProccess();
    }
}
