package com.imooc.test_2;

public class Test_4_2_22_Tricycle extends Test_4_2_22_NonMotor {
    // 在无参构造中实现对轮子属性值进行修改
	public Test_4_2_22_Tricycle() {
		this.setWheel(3);
	}
	// 重写运行方法，描述内容为：三轮车是一款有**个轮子的非机动车。其中**的数据由属性提供
	public String work() {
		String str = "三轮车是一款有" + this.getWheel() + "个轮子的非机动车。";
		return str;
	}
}
