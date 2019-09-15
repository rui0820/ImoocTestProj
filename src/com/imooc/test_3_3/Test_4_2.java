package com.imooc.test_3_3;

public class Test_4_2 {

	public static void main(String[] args) {
		Integer x = 400;
		Integer y = x;
		System.out.println((x == y));
		x++;
		StringBuilder sb1 = new StringBuilder("123");
		StringBuilder sb2 = sb1;
		System.out.println((sb1 == sb2));
		sb1.append("5");
		System.out.println((x == y) + " " + (sb1 == sb2));
		System.out.println(sb1);
		System.out.println(sb2);
	}
}
