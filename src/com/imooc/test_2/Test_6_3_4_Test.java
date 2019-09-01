package com.imooc.test_2;

public class Test_6_3_4_Test {

	public static void main(String[] args) {
		System.out.println("创建1号皇帝对象");
		Test_6_3_4_Emperor one = Test_6_3_4_Emperor.getInstance();
		System.out.println("创建2号皇帝对象");
		Test_6_3_4_Emperor two = Test_6_3_4_Emperor.getInstance();
		System.out.println("创建3号皇帝对象");
		Test_6_3_4_Emperor three = Test_6_3_4_Emperor.getInstance();
		System.out.println("三个皇帝对象依次是：");
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}
}
