package com.imooc.test_2;

public class Test_5_4_3_Banana extends Test_5_4_3_Fruits{
    // 私有属性：品种（variety）
    private String variety;
    //创建带参构造方法为所有属性赋值
    public Test_5_4_3_Banana() {
    	
    }
    public Test_5_4_3_Banana(String shape,String taste,String variety) {
    	super(shape,taste);
    	this.setVariety(variety);
    }
    
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}
    //创建无参无返回值的advantage方法，描述为：**果形**,果肉香甜，可供生食。
    public void advantage() {
    	System.out.println(this.getVariety() + "果形" + this.getShape() + "," + this.getTaste() + ",可供生食");
    }
    //创建重载advantage方法（带参数color），描述为：**颜色为**
    public void advantage(String color) {
    	System.out.println(this.getVariety() + "颜色为" + color + "色");
    }
}
