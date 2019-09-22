package dao;

import java.util.List;

import bean.Car;

import util.DBUtils;

public class CarDao {
	
	public int add(String name,String color) {
		String[] args= new String[]{name,color};
		return DBUtils.update("insert into car(name,color) values(?,?)", args);
		
	}
	
	public List<Car> listAll_page(String  size,String startpage) {
		
		int page=(Integer.parseInt(startpage)-1)*Integer.parseInt(size);
		
		List<Car> list = DBUtils.getall("select * from car limit ? offset ?", new Car(),new String[]{size,String.valueOf(page)});
		
		
		return list;
		
	}
	
	public List<Car> listAll() {
		String[] args= new String[]{};
		List<Car> list = DBUtils.getall("select * from car", new Car(),args);
		
		
		return list;
		
	}
	
	public Car findById(String id) {
		String[] args= new String[]{id};
		List<Car> list = DBUtils.getall("select * from car where id=?",new Car(), args);
		return list.get(0);
		
	}
	
	public int deleteById(String id) {
		String[] args= new String[]{id};
		return DBUtils.update("delete from car where id=?", args);
		
	}
	
	public int updateById(String name,String color,String id) {
		String[] args= new String[]{name,color,id};
		return DBUtils.update("update car set name=?,color=? where id=?", args);
		
	}
	
	
	
}
