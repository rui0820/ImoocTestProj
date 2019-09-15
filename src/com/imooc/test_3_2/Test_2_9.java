package com.imooc.test_3_2;

public class Test_2_9 {
	int test(Boolean b,int i) {
		if(b)
			return(i / 7);
		return(i / 49);
	}
	public static void main(String[] args) {
		Boolean bool = new Boolean(true);
		Integer x = 343;
		Integer y = new Test_2_9().test(bool, x);
		System.out.println(y);
	}
}
