package com.harman.sample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class sample1 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            String empcode, empname, empdesig, empsalary, empmobnum;

            System.out.println("enter empcode");
            empcode = input.next();
            System.out.println("enter empname");
            empname = input.next();
            System.out.println("enter empdesig");
            empdesig = input.next();
            System.out.println("enter empsalary");
            empsalary = input.next();
            System.out.println("enter empmobnum");
            empmobnum = input.next();
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?autoReconnect=true&useSSL=false", "root", "");
            Statement stnt = c.createStatement();
            stnt.executeUpdate("INSERT INTO `employee`( `empcode`, `empname`, `empdesig`, `empsalary`, `empmobnum`) VALUES(" + empcode + ",'" + empname + "','" + empdesig + "'," + empsalary + "," + empmobnum + ")");

            System.out.println("inserted successfully");


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}