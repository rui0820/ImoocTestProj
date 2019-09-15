package com.imooc.test_3_3;

public class Test_3_5 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("123");
		String s1 = "123";
		sb1.append("abc");
		s1 = s1.concat("abc");
		System.out.println(sb1 + " " + s1);
	}
}
