package com.imooc.test_2;
//创建类Bird并实现接口IFly
public class Test_7_5_13_Bird implements Test_7_5_13_IFly{
    //重写fly()方法
	@Override
	public void fly() {
		System.out.println("小鸟在天空翱翔");
	}
}
