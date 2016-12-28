package com.dao;

import com.entity.Classes;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classes c1 = new Classes();
		c1.setId(101);
		c1.setName("Java");
		c1.setNum(30);
		
		ClassesDao classesDao = new ClassesDao();
		
//		int r= classesDao.insert(c1);
//		System.out.println(r);
		 
//		c1 = classesDao.findById(101);
//		if (c1 == null) {
//			System.out.println("该对象不存在");
//		} else {
//			System.out.println(c1);
//		}
		
//		classesDao.delete(104);
		int r = classesDao.update(c1);
		System.out.println(r);
	}
}
