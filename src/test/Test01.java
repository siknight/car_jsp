package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import bean.Car;
import dao.CarDao;
import dao.CarDao_page;

public class Test01 {
	@Test
	public void test01() throws Exception {
		new CarDao().add("奔驰", "蓝色");
		System.out.println("aaa");
		System.out.println("bbbb");
		System.out.println("ccc");
		System.out.println("ddd");
		System.out.println("e333");
		System.out.println("fff");
	}
	
	@Test
	public void test02() throws Exception {
		System.out.println(new CarDao().listAll());
	}
	
	@Test
	public void test03() throws Exception {
		new CarDao().deleteById("1");
	}
	
	@Test
	public void test04() throws Exception {
		new CarDao().updateById("保时捷", "红色", "2");
	}
	
	
	@Test
	public void test05() throws Exception {
		List<Car> listpage = new CarDao_page().listpage("2","1");
		System.out.println(listpage);
	}

}
