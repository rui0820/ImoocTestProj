package com.imooc.test_2;
//创建类Plane并实现接口IFly
public class Test_7_5_13_Plane implements Test_7_5_13_IFly{
    //重写fly方法
	@Override
	public void fly() {
		System.out.println("飞机在天上飞");
	}
}
