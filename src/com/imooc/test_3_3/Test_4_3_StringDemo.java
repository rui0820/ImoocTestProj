package com.imooc.test_3_3;

public class Test_4_3_StringDemo {

	public static void main(String[] args) {
		// 定义字符串"abc"
		StringBuilder str = new StringBuilder("abc");
		System.out.println(str);
		// 经过处理得到字符串"fed---cba"
		str.append("---def");
		str.reverse();
		System.out.println(str);
		// 进一步变换得到字符串"fedcba"
		str.delete(3, 6);
		System.out.println(str);
	}
}
