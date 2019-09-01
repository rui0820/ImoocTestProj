package com.imooc.test_2;
/**
 * 定义一个抽象类图形Shape类，由该类派生出两个子类圆Circle类和矩形Rectangle类。
 * Shape里声明了抽象方法area（）。该方法分别在两个子类里得到实现
 */
public class Test_7_4_4_Test {
	public static void main(String[] args) {
	    //创建类的实例，并分别对圆的半径和矩形的长宽进行赋值
		Test_7_4_4_Circle c = new Test_7_4_4_Circle(4);
		Test_7_4_4_Rectangle r = new Test_7_4_4_Rectangle(3,9);
		//调用area（）方法，输出结果
		c.area();
		r.area();
	}
}
