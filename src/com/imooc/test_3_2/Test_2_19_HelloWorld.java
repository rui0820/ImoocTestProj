package com.imooc.test_3_2;

public class Test_2_19_HelloWorld {

	public static void main(String[] args) {
        //定义float类型变量，赋值为88.99
		float f1 = 88.99f;
		//将基本类型转换为字符串
		String s1 = Float.toString(f1);
		//打印输出
		System.out.println("f1转换为String型后与整数20的求和结果为：" + s1 + 20);
		//定义String类型变量，赋值为"188.55"
		String str = "188.55";
	    // 将字符串转换为基本类型double
		double d1 = Double.valueOf(str);
		//打印输出
		System.out.println("str转换为double型后与整数20的求和结果为：" + (d1 + 20));
	}
}
