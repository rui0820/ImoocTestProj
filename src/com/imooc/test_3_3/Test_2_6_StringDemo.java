package com.imooc.test_3_3;

public class Test_2_6_StringDemo {

	public static void main(String[] args) {
		/*已知字符串"abcdefg"，使之经过处理得到字符串"CDE",并进一步将“DE”替换为“MM”，得到结果：CMM */
		String str = "abcdefg";
		str = str.toUpperCase().substring(2, 5);
		str = str.replace("DE", "MM");
		System.out.println(str);
	}
}
