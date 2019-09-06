package com.imooc.test_2;
interface IA{
	int TEMP = 10;
}
interface IB extends IA{
	String TEMP = "temp";
}
public class Test_7_5_11 implements IA,IB {
	public static void main(String[] args) {
		IA a = new Test_7_5_11();
		IB b = new Test_7_5_11();
		System.out.print(a.TEMP);
		System.out.println(b.TEMP);
	}
}
