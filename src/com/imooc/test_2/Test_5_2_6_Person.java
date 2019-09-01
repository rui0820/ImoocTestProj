package com.imooc.test_2;

public class Test_5_2_6_Person {
    //私有属性：name（姓名）、age(年龄)、sex（性别）
    private String name;
    private int age;
    private String sex;
    //带参构造方法（name、age、sex为参数）
    public Test_5_2_6_Person() {
    	
    }
    public Test_5_2_6_Person(String name,String sex,int age) {
    	this.setName(name);
    	this.setSex(sex);
    	this.setAge(age);
    }
    //通过封装实现对属性的get/set方法设定
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
    //重写toString方法，表示形式为：姓名：+**+  年龄：+**+  性别：+**
	public String toString() {
		return "姓名：" + this.getName() + " 年龄：" + this.getAge() + " 性别：" + this.getSex();
	}
}
