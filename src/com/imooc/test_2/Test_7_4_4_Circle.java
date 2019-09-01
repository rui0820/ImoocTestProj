package com.imooc.test_2;

public class Test_7_4_4_Circle extends Test_7_4_4_Shape{
    //属性：圆的半径r
	private double r;
    //创建带参构造方法以及无参构造方法
     public Test_7_4_4_Circle() {
    	 
     }
     public Test_7_4_4_Circle(double r) {
    	 this.setR(r);
     }
    //创建针对半径的赋值和取值方法
 	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	//重写父类中area()方法
 	@Override
 	public void area() {
 		double area = Math.PI * this.getR() * this.getR();
 		System.out.println("圆的面积为 " + area);
 	}
}
