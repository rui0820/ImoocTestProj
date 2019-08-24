package com.imooc.test_2;

public class Test_4_2_8_Work {
    // 属性：工作名称
    private String name ;

	// 无参构造方法
    public Test_4_2_8_Work() {
    	
    }
	// 带参构造方法，完成工作类型的赋值
    public Test_4_2_8_Work(String name) {
    	this.setName(name);
    }
   // 公有的get***/set***方法完成属性封装
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// 方法：工作描述，描述内容为：开心工作
	public String work() {
		String str = "开心工作";
		return str;
	}

}
