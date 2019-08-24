package com.imooc.test_2;

public class Test_4_2_22_ElectricVehicle extends Test_4_2_22_NonMotor {
    // 私有属性：电池品牌
	private String batteryBrand;
	
	public Test_4_2_22_ElectricVehicle() {
		
	}
	public Test_4_2_22_ElectricVehicle(String batteryBrand) {
		this.setBatteryBrand(batteryBrand);
	}
    // 公有的get***/set***方法完成属性封装
	public String getBatteryBrand() {
		return batteryBrand;
	}
	public void setBatteryBrand(String batteryBrand) {
		this.batteryBrand = batteryBrand;
	}
	// 重写运行方法，描述内容为：这是一辆使用**牌电池的电动车。其中**的数据由属性提供
	public String work() {
		String str = "这是一辆使用" + this.getBatteryBrand() + "牌电池的电动车。";
		return str;
		
	}
}
