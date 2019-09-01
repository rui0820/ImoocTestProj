package com.imooc.test_2;

public class Test_7_3_9_Manager{
	public void play(Test_7_3_9_Animal animal){
		if(animal instanceof Test_7_3_9_Dog) {
			((Test_7_3_9_Dog)animal).shout();
		}else {
			((Test_7_3_9_Roo)animal).leap();
		}
	}
}
