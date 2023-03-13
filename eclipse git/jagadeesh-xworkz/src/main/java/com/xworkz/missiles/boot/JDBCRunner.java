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

			
			Statement statement=connection.createStatement();
			//0 is given as Id for each insert to do autoIncreamentt
			int rows=statement.executeUpdate(insert);
			int rows2=statement.executeUpdate(insert2);
			int rows3=statement.executeUpdate(insert3);
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
