package com.imooc.test_2;
/**
 * 使用接口的知识，定义接口IFly，创建三个类Plane类、Bird类、Balloon类，
 * 分别重写接口中的fly（）方法，然后再测试类中进行调用。
 */
public class Test_7_5_13_Test {

	public static void main(String[] args) {
		  //对象实例化
		Test_7_5_13_Balloon test1 = new Test_7_5_13_Balloon();
		Test_7_5_13_Bird test2 = new Test_7_5_13_Bird();
		Test_7_5_13_Plane test3 = new Test_7_5_13_Plane();
        //分别调用fly()方法
		test1.fly();
		test2.fly();
		test3.fly();
	}
}
