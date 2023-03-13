package com.xworkz.missiles.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/missile", "root", "Xworkz@123");
			String insert="insert into missile_table values(0,'trishul','DRDO','India',25652,'Military')";
			String insert2="insert into missile_table values(0,'AGTC','HAL','India',85623,'Military')";
			String insert3="insert into missile_table values(0,'NISAR','ISRO','India',984632,'communication')";
			String update="update missile_table set country ='Bharat' where id=1 ";
			String update1="update missile_table set name ='thishuul' where id=3 ";
			
            String delete="delete from missile_table where id='5'";
            String delete1="delete from missile_table where id='6'";
            
            //DELETE FROM  movies WHERE movie_name='lagn';
            		
            		
			Statement statement=connection.createStatement();
			//0 is given as Id for each insert to do autoIncreamentt
			int rows=statement.executeUpdate(insert);
			int rows2=statement.executeUpdate(insert2);
			int rows3=statement.executeUpdate(insert3);
			int rows4=statement.executeUpdate(update);
			int rows5=statement.executeUpdate(update1);
			int rows6=statement.executeUpdate(delete);
			int rows7=statement.executeUpdate(delete1);
			System.out.println("rows inserted "+rows);
			System.out.println("rows inserted "+rows2);
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
