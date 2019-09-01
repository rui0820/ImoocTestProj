package com.imooc.test_2;

import java.util.Random;

public class Test_7_3_16_Test {
/**
 * 应用继承和多台的思想，编写动物类，成员方法是动物叫声
 * 写三个具体的类（猫、狗、羊），他们都是动物类的子类，并重写父类的成员方法
 * 编写测试类，随机产生三种动物，调用叫声这个方法
 * 程序参考运行效果如下：
 * 小羊的叫声：咩咩咩~~~
 * 小狗的叫声：汪汪汪~~~
 */
	public static void main(String[] args) {
		// 生成父类对象数组,数组长度为5
		Test_7_3_16_Animal[] animal = new Test_7_3_16_Animal[5];
		// 产生随机数，随机产生三种具体子类的实例
		for(int i = 0;i < animal.length;i++) {
			int r = new Random().nextInt(2);
			switch(r) {
			case 0:
				animal[i] = new Test_7_3_16_Cat();
				break;
			case 1:
				animal[i] = new Test_7_3_16_Dog();
				break;
			case 2:
				animal[i] = new Test_7_3_16_Sheep();
				break;
			}
		}
		// 循环输出，循环体中每个对象分别调用cry()方法。
		for(Test_7_3_16_Animal n:animal) {
			n.cry();
		}
	}
}
