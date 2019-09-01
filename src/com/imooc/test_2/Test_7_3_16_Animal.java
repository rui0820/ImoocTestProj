package com.imooc.test_2;

public class Test_7_3_16_Animal {
    //属性：kind(种类)
	private String kind;
	
	public Test_7_3_16_Animal(){
		
	}
	//创建带参（kind为参数）构造函数
	public Test_7_3_16_Animal(String kind) {
		this.setKind(kind);
	}
    //应用封装实现对私有属性的get/set操作
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	//创建成员方法cry():void
	public void cry() {
		
	}
}
