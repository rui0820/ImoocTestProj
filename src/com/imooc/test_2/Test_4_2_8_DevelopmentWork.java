package com.imooc.test_2;

public class Test_4_2_8_DevelopmentWork extends Test_4_2_8_Work{
    // 属性：有效编码行数、目前没有解决的Bug个数
	private long loc;
	private int bugNum;
	//编写构造方法，并调用父类相关赋值方法，完成属性赋值
	public Test_4_2_8_DevelopmentWork() {
		
	}
	public Test_4_2_8_DevelopmentWork(String name,long loc,int bugNum) {
		this.setName(name);
		this.setLoc(loc);
		this.setBugNum(bugNum);
	}
    // 公有的get***/set***方法完成属性封装
	public long getLoc() {
		return loc;
	}
	public void setLoc(long loc) {
		this.loc = loc;
	}
	public int getBugNum() {
		return bugNum;
	}
	public void setBugNum(int bugNum) {
		this.bugNum = bugNum;
	}
	// 重写运行方法，描述内容为：**的日报是：今天编写了**行代码，目前仍然有**个bug没有解决。其中**的数据由属性提供
	public String work() {
		String str = this.getName() + "的日报是：今天编写了" + this.getLoc() + "行代码，目前仍然有" + this.getBugNum() + "个bug没有解决";
        return str;
	}
}
