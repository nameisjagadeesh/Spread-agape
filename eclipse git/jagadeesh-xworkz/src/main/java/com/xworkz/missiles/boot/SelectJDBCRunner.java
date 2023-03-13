package com.xworkz.missiles.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectJDBCRunner {

	public static void main(String[] args) {

//loading and registering the driver is optional after java 1.8

		// below try resource block is to close automatically
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/missile", "root",
				"Xworkz@123")) {
			String insert="insert into missile_table values(?,?,?,?,?,?)";
			PreparedStatement prepared=connection.prepareStatement(insert);
			prepared.setInt(1, 0);
			prepared.setString(2, "hinfa");
			prepared.setString(3, "BEL");
			prepared.setString(4, "Indica");
			prepared.setLong(5, 5563225L);
			prepared.setString(6, "remoteSensing");
			int rows=prepared.executeUpdate();
			System.out.println("rows inserted"+rows);

			String select="select * from missile_table ent";
			ResultSet set=prepared.executeQuery(select);
			while(set.next()) {
				int id=set.getInt("id");
				String name=set.getString("name");
				String company=set.getString("company");
				String country=set.getString("country");
				Long price=set.getLong("price");
				String type=set.getString("type");
				
				System.out.println("ID :"+id+" name :"+name+" company :"+company+" country :"+country+" price :"+price+" type :"+type);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
