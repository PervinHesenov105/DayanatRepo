/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.myschool.menu;

import az.myschool.service.*;
import az.myschool.util.MenuUtil;

/**
 *
 * @author Perfect
 */
public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_STUDENT(3, "Add Student", new MenuAddStudentService()),
    ADD_TEACHER(4, "Add Teacher", new MenuAddTeacherService()),
    SHOW_STUDENT(5, "Show Students", new MenuShowStudentService()),
    SHOW_TEACHER(6, "Show Teachers", new MenuShowTeacherService()),
    EXIT(7, "Exit", new MenuExitService()),
    UNKNOWN(new MenuUnknownService());

    private int num;
    private String label;
    private MenuService service;

    private Menu(int num, String label, MenuService service) {
        this.num = num;
        this.label = label;
        this.service = service;
    }

    private Menu(MenuService service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return num + "." + label;
    }

    public void enumProccess() {
        service.process();
        MenuUtil.startMenu();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public MenuService getService() {
        return service;
    }

    public void setService(MenuService service) {
        this.service = service;
    }

    public static Menu findNumber(int selectedNumber) {
        Menu menu[] = Menu.values();
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].getNum() == selectedNumber) {
                return menu[i];
            }
        }

        return UNKNOWN;
    }

}
