package com.imooc.test_2;

public class Test_6_3_4_Emperor {
    //定义私有构造方法
	private Test_6_3_4_Emperor() {
		
	}
	 //定义私有静态类对象
	private static Test_6_3_4_Emperor instance = null;
	 //定义公有静态方法返回类内的私有静态对象
	public static Test_6_3_4_Emperor getInstance() {
		if(instance == null) {
			instance = new Test_6_3_4_Emperor();
		}
		return instance;
	}
}
