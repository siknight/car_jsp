package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Car;

import util.DBUtils;

public class CarDao_page {
	
	public List<Car> listpage(String  size,String startpage){
		System.out.println("size="+size+",startpage="+startpage);
		ArrayList<Car> list = new ArrayList<Car>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC", "root", "jiang");
			PreparedStatement ps = connection.prepareStatement("select * from car limit ?,?");
			int page=(Integer.parseInt(startpage)-1)*Integer.parseInt(size);
			
			System.out.println("size="+size+",page="+page);
			ps.setInt(1, page);
			ps.setInt(2, Integer.parseInt(size));
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String color = rs.getString("color");
				list.add(new Car(Integer.parseInt(id), name, color));
			}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
}
