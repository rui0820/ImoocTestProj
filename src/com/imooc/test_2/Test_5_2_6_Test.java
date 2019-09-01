package com.imooc.test_2;

public class Test_5_2_6_Test {
/**
 * 使用面向对象的思想，设计定义类Person继承Object类，重写toString方法实现对象信息输出
 * 运行效果如下：
 * 姓名：李明 年龄：18 性别：男
 */
	public static void main(String[] args) {
	    //实例化对象，传入属性值（李明, 男,18）
		Test_5_2_6_Person one = new Test_5_2_6_Person("李明","男",18);
	    //打印输出对象信息
		System.out.println(one);
	}
}
