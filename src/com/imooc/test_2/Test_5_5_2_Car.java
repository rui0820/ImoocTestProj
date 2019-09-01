package com.imooc.test_2;

public class Test_5_5_2_Car {
    //属性：车的颜色color、车主姓名userName
	private String color;
	private String userName;

	public Test_5_5_2_Car(){
		
	}
	//带参构造函数（参数为color和useName）
	public Test_5_5_2_Car(String color,String userName){
		this.setColor(color);
		this.setUserName(userName);
	}
    //通过封装实现对私有属性的get/set操作
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
    //创建无参无返回值得方法use（描述内容为：我是机动车！）
	public void use() {
		System.out.println("我是机动车！");
	}
	//重写equals方法，比较两个对象是否相等（比较color，userName）
	public boolean equals(Test_5_5_2_Car car) {
		if(car == null) {
			return false;
		}else if(car.getUserName() == this.getUserName() && car.getColor() == this.getColor()) {
			return true;
		}else {
			return false;
		}
	}
}
