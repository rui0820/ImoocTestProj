package com.imooc.test_2;

public class Test_4_2_8_Test {
    public static void main(String[] args) {
    	Test_4_2_8_Work work = new Test_4_2_8_Work();
    	Test_4_2_8_TestWork tw = new Test_4_2_8_TestWork("测试工作",10,5);
    	Test_4_2_8_DevelopmentWork dw = new Test_4_2_8_DevelopmentWork("研发工作",1000,10);
		System.out.print("父类信息测试：");
		System.out.println(work.work());
		System.out.print("测试工作类信息测试：");
		System.out.println(tw.work());
		System.out.print("研发工作类信息测试：");
		System.out.println(dw.work());
	}
}
