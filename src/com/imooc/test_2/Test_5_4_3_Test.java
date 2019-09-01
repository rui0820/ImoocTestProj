package com.imooc.test_2;

public class Test_5_4_3_Test {
	/**
	 * 使用面向对象的思想，事项杨梅和仙人蕉的信息描述 程序参考运行效果图如下 水果可供人们食用！ fru1和fru2的引用比较：true
	 * --------------------------------- 
	 * 杨梅：紫红色、圆形、果味酸甜适中 杨梅酸甜适中，非常好吃！
	 * 杨梅的信息：果实为圆形、紫红色，酸甜适中，非常好吃！ 
	 * ------------------------------------
	 * 仙人蕉果形短而椭圆，果肉香甜，可供生食。 仙人蕉颜色为黄色
	 * 
	 */
	public static void main(String[] args) {
		// 实例化2个父类对象，传入两组相同的参数值
		Test_5_4_3_Fruits one = new Test_5_4_3_Fruits("圆形", "绿色");
		Test_5_4_3_Fruits two = new Test_5_4_3_Fruits("圆形", "绿色");
		// 调用父类eat方法
		one.eat();
		// 测试重写equals方法，判断两个对象是否相等
		System.out.println("fru1和fru2的引用比较：" + one.equals(two));
		System.out.println("————————————————————————————————————————");
		// 实例化子类对象，并传入相关参数值
		Test_5_4_3_Waxberry three = new Test_5_4_3_Waxberry("圆形", "紫红色", "酸甜适中");
		// 调用子类face方法和eat方法
		System.out.println(three.face());
		three.eat();
		// 测试重写toString方法，输出子类对象的信息
		System.out.println(three);
		System.out.println("——————————————————————————————————————————————");
		// 实例化Banana类对象，并传入相关参数值
		Test_5_4_3_Banana four = new Test_5_4_3_Banana("短而椭圆", "香甜", "仙人蕉");
		// 调用子类的advantage和它的重载方法
		four.advantage();
		four.advantage("黄");
	}
}
