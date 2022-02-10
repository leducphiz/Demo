/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP;

/**
 * @author PhiLe
 */

import JacaLanguage.Teacher;

public class Main {

    public static void main(String[] args) {
        Student SV1 = new Student();

        //Set thông tin cho sinh viên SV1
//        SV1.code = 1;
        SV1.setCode(1);
        SV1.name = "Nguyen Van A";
        SV1.gender = "Female";
        SV1.math = 5.5;
        SV1.liter = 7.0;

        //Hiển thị thông tin của SV1
        System.out.println("Code:" + SV1.getCode());
        System.out.println("Name:" + SV1.name);
        System.out.println("Gender:" + SV1.gender);
        System.out.println("Math:" + SV1.math);
        System.out.println("Literature:" + SV1.liter);

//        Teacher TC1 = new Teacher();
//        //Set thông tin cho sinh viên SV1
//        TC1.code = 1;
//        TC1.name = "Nguyen Van A";
//        TC1.gender = "Female";
//        TC1.slot = 5;
//        //Hiển thị thông tin của Tci
//        System.out.println("Code:" + TC1.code);
//        System.out.println("Name: " + TC1.name);
//        System.out.println("Gender:" + TC1.gender);
//        System.out.println("Math:" + TC1.slot);
    }
}
