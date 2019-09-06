package com.imooc.test_2;
//创建外部类BallTest
public class Test_7_6_9_BallTest {
	// 创建成员内部类Inner_m
	public Inner_m getInner_m() {
		return new Inner_m();
	}
	class Inner_m implements Test_7_6_9_Ball{
		@Override
		public void play() {
			System.out.println("成员内部类：");
			System.out.println("打篮球");
		}
	}
	// 创建方法内部类
	public void info() {
		class Inner_f implements Test_7_6_9_Ball{
			@Override
			public void play() {
				System.out.println("****************");
				System.out.println("方法内部类：");
				System.out.println("打乒乓球");
			}
		}
		new Inner_f().play();
	}
	// 定义一个方法void playBall(Ball ball)，调用play()方法
	void playBall(Test_7_6_9_Ball ball) {
		ball.play();
	}
}
