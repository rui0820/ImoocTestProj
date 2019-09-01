package com.imooc.test_2;
//要求Waxberry类不允许有子类
public class Test_5_4_3_Waxberry extends Test_5_4_3_Fruits {
    // 私有属性：颜色（color）
    private String color;
	//创建构造方法，完成调用父类的构造方法，完成属性赋值
    public Test_5_4_3_Waxberry() {
    	
    }
    public Test_5_4_3_Waxberry(String shape,String taste,String color) {
    	super(shape,taste);
    	this.setColor(color);
    }
    
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
    //创建不允许重写的face方法，描述为：杨梅：**、**，果味酸甜适中
    public final String face() {
    	return "杨梅：" + this.getColor() + "、" + this.getShape() + ",果味" + this.getTaste();
    }
    //重写父类eat方法，描述为：杨梅酸甜适中，非常好吃！
    @Override
    public void eat() {
    	System.out.println("杨梅" + this.getTaste() +"，非常好吃");
    }
    //重写toString方法，输出的表现形式不同（输出shape,color,taste）
    @Override
    public String toString() {
    	return "杨梅的信息：果实为" + this.getShape() + "、" + this.getColor() + "，" + this.getTaste() + "，非常好吃！";
    }
}
