package dao;

import java.util.List;

import bean.User;
import util.DBUtils;

public class UserDao {
	
	public int register(String username,String password,String sex) {
		String[] args= new String[]{username,password,sex};
		return DBUtils.update("insert into user(name,password,sex) values(?,?,?)", args);
		
	}
	
	

	
	public User login(String username,String password) {
		String[] args= new String[]{username,password};
		List<User> list = DBUtils.getall("select * from user where name=? and password = ?", new User(),args);
		User user = list.get(0);
		System.out.println("user="+user);
		
		return user;
		
	}

	
	
	
	
	
	
	
}
