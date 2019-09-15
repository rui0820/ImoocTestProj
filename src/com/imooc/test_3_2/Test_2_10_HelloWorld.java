package com.imooc.test_3_2;

public class Test_2_10_HelloWorld {

	public static void main(String[] args) {
		// 定义int类型变量，值为100
		int score = 100;
		// 创建Integer包装类对象，表示变量score1的值
		Integer score1 = score;
		// 将Integer包装类转换为double类型
		double double1 = score1.doubleValue();
		// 将Integer包装类转换为long类型
		long long1 = score1.longValue();
		// 将Integer包装类转换为int类型
		int int1 = score1;
		// 打印输出
		System.out.println("int类型变量score：" + score);
		System.out.println("score对应的Integer类型结果为：" + score1);
		System.out.println("score对应的double类型结果为：" + double1);
		System.out.println("score对应的long类型结果为：" + long1);
		System.out.println("重新由Integer转换为int类型的结果为：" + int1);
	}
}
