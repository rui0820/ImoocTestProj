package com.imooc.test_2;

public class Test_6_3_2_Test {

	public static void main(String[] args) {
		System.out.println("第一个地球创建中。。。。");
		Test_6_3_2_Earth one = Test_6_3_2_Earth.getInstance();
		System.out.println("第二个地球创建中。。。。");
		Test_6_3_2_Earth two = Test_6_3_2_Earth.getInstance();
		System.out.println("第三个地球创建中。。。。");
		Test_6_3_2_Earth three = Test_6_3_2_Earth.getInstance();
		System.out.println("问：三个地球是同一个么？");
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}
}
