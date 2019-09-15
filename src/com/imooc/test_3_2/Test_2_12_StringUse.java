package com.imooc.test_3_2;

public class Test_2_12_StringUse {

	public static void main(String[] args) {
		//将基本类型转换为字符串
		double a = 2.5; 
		String str1 = Double.toString(a); 
		System.out.println("a 转换为String型后+10的结果为： " + str1 + 10);				
		String str = "2.8";
		// 将字符串转换为基本类型
		double b = Double.parseDouble(str);
        System.out.println("str 转换为double型后+10的结果为： " + (b + 10));
	}
}
