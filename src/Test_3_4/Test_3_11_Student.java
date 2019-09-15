package Test_3_4;

public class Test_3_11_Student {
	 //根据需求完成Student类的定义
	private int stuld;//学号
	private String name;//姓名
	private float score;//成绩
	public Test_3_11_Student(int stuld, String name, float score) {
		super();
		this.stuld = stuld;
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return " [学号：" + stuld + ", 姓名：" + name + ", 成绩：" + score + "]";
	}
	public int getStuld() {
		return stuld;
	}
	public void setStuld(int stuld) {
		this.stuld = stuld;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(score);
		result = prime * result + stuld;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj.getClass() == Test_3_11_Student.class) {
			Test_3_11_Student stu = (Test_3_11_Student)obj;
			return stu.getName().equals(name)&&stu.getStuld()==stuld;
		}
		return false;
	}
}


