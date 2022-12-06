package oop_final_project;
import java.sql.*;



public class dbcon {
    static Connection con;
    static Statement stat=null;
    public static Statement getConnection(){
        try {
           String url="jdbc:mysql://localhost:3306/grocery";
            con = DriverManager.getConnection(url,"root","");
            stat = con.createStatement();
        } catch (SQLException e) {
            System.out.println("Failed "+e.toString());
        }
        return stat;
    }
    public static void closeCon() throws SQLException {
        con.close();
    }
    public static void main (String[]args){
        getConnection();
        
    }
}
