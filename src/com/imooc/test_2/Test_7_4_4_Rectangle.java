package com.imooc.test_2;

public class Test_7_4_4_Rectangle extends Test_7_4_4_Shape{
    //属性：矩形的长lenghth、宽wide
	private float lenghth;
	private float wide;
	//创建带参构造方法以及无参构造方法
	public Test_7_4_4_Rectangle() {
		
	}
	public Test_7_4_4_Rectangle(float lenghth,float wide) {
		this.setLenghth(lenghth);
		this.setWide(wide);
	}
    //创建针对长、宽的赋值和取值方法
	public float getLenghth() {
		return lenghth;
	}
	public void setLenghth(float lenghth) {
		this.lenghth = lenghth;
	}
	public float getWide() {
		return wide;
	}
	public void setWide(float wide) {
		this.wide = wide;
	}
	//重写父类的area（）方法
	@Override
	public void area() {
		double area = this.getLenghth() * this.getWide();
		System.out.println("矩形的面积为 " + area);
	}
}
