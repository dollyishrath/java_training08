package com.trimindtech.training.day08;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
    public static Connection con;
    static{
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookrental","root","root");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static Connection getCon(){
        return con;
    }
}
