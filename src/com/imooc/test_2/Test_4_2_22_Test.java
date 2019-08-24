package com.imooc.test_2;

public class Test_4_2_22_Test {

	public static void main(String[] args) {
		Test_4_2_22_NonMotor nm = new Test_4_2_22_NonMotor("天宇","红",4,2);
		Test_4_2_22_Bicycle bicycle = new Test_4_2_22_Bicycle("捷安特","黄");
		Test_4_2_22_ElectricVehicle ev = new Test_4_2_22_ElectricVehicle("飞鸽");
		Test_4_2_22_Tricycle tricycle = new Test_4_2_22_Tricycle();
		System.out.print("父类信息测试：");
		System.out.println(nm.work());
		System.out.print("自行车类信息测试：");
		System.out.println(bicycle.work());
		System.out.print("电动车类信息测试：");
		System.out.println(ev.work());
		System.out.print("三轮车类信息测试：");
		System.out.println(tricycle.work());
	}

}
