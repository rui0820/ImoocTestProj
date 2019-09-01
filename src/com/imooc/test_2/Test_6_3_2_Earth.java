package com.imooc.test_2;

public class Test_6_3_2_Earth {
    //定义私有构造方法，并在构造方法中打印输出“地球诞生”
	private Test_6_3_2_Earth() {
		System.out.println("地球诞生");
	}
	 //定义私有静态类对象并完成实例化
	private static Test_6_3_2_Earth instance = new Test_6_3_2_Earth();
	 //定义公有静态方法返回类内的私有静态对象
	public static Test_6_3_2_Earth getInstance() {
		return instance;
	}
}
