package com.imooc.test_2;

public class Test_7_3_15_Test {

	public static void main(String[] args) {
		Test_7_3_15_Father s = new Test_7_3_15_Son();
		Test_7_3_15_Father d = new Test_7_3_15_Daughter();
		Test_7_3_15_Son s1 = (Test_7_3_15_Son)s;
		s1.show();
		Test_7_3_15_Daughter d1 = (Test_7_3_15_Daughter)s;
		d1.show();
	}

}
