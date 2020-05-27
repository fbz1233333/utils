package jdbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.sql.*;

public class jdbcDemo {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String url="jdbc:mysql://localhost:3306/myinfo?serverTimezone=UTC";
        String user="root";
        String password="123456";
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver);
        Connection connection=DriverManager.getConnection(url,user,password);
        Statement st=connection.createStatement();
        ResultSet rs=st.executeQuery("select * from user");
        while(rs.next()){
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("password"));
        }
    }
}
