package Test_3_4;

import java.util.List;
import java.util.ArrayList;

public class Test_2_8_EmployeeTest {

	public static void main(String[] args) {
		//定义ArrayList对象
        List list = new ArrayList();
        //创建三个Employee类的对象
        Test_2_8_Employee emp1 = new Test_2_8_Employee(1,"张三",5000);
        Test_2_8_Employee emp2 = new Test_2_8_Employee(2,"李四",5500);
        Test_2_8_Employee emp3 = new Test_2_8_Employee(3,"赵六",4000);
        //添加员工信息到ArrayList中
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        //显示员工的姓名和薪资
        System.out.println("员工姓名    员工薪资");
        for(int i = 0;i < list.size();i++) {
        	System.out.print(((Test_2_8_Employee)(list.get(i))).getName());
        	System.out.print("        ");
        	System.out.print(((Test_2_8_Employee)(list.get(i))).getSalary());
        	System.out.println();
        }
	}
}
