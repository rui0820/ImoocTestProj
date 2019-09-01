package com.imooc.test_2;

public class Test_5_5_2_Test {
	/**
	 * 使用面向对象的思想，实现出租车和家用轿车的信息描述
	 */
	public static void main(String[] args) {
		// 实例化父类对象，并传入两组相同的属性值
		Test_5_5_2_Car one = new Test_5_5_2_Car("红色", "韩梅梅");
		Test_5_5_2_Car two = new Test_5_5_2_Car("红色", "韩梅梅");
		// 调用父类use方法
		one.use();
		// 通过重写equals方法，比较两个对象是否相等
		System.out.println("car1和car2的引用比较：" + one.equals(two));
		System.out.println("==================================");
		// 实例化子类Taxi对象，并传入属性值
		Test_5_5_2_Taxi three = new Test_5_5_2_Taxi("蓝色", "张小泉", "长生公司");
		// 调用ride和use方法
		System.out.println(three.ride());
		three.use();
		// 输出重写toString后的taxi信息
		System.out.println("taxi的信息是：" + three.toString());
		System.out.println("==================================");
		// 实例化子类HomeCar对象，并传入属性值
		Test_5_5_2_HomeCar four = new Test_5_5_2_HomeCar("紫色", "孙二娘", 7);
		// 调用display方法及它的重载方法
		four.display();
		four.display(5);
	}
}
