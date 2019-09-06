package com.imooc.test_2;
//测试类
/**
 * 分别通过成员内部类、方法内部类、匿名内部类完成接口Ball，在测试类BallTest中的调用
 * 程序参考运行效果图如下
 * 成员内部类：
 * 打篮球
 * **************
 * 方法内部类：
 * 打乒乓球
 * **************
 * 匿名内部类：
 * 打排球
 *
 */
public class Test_7_6_9_Test {
	public static void main(String[] args) {
		//完成成员内部类内部测试
		Test_7_6_9_BallTest.Inner_m inner_m1 = new Test_7_6_9_BallTest().new Inner_m();
		inner_m1.play();
		Test_7_6_9_BallTest ball = new Test_7_6_9_BallTest();
		Test_7_6_9_BallTest.Inner_m inner_m2 = ball.getInner_m();
		inner_m2.play();
		//完成方法内部类测试
		ball.info();
		//完成匿名内部类测试
		ball.playBall(new Test_7_6_9_Ball() {
			@Override
			public void play() {
				System.out.println("****************");
				System.out.println("匿名内部类：");
				System.out.println("打排球");
			}
		});
	}
}
