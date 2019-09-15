package Test_3_4;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Test_3_11_StudentTest {

	public static void main(String[] args) {
		//定义三个Student类的对象及一个HashSet类的对象
		Test_3_11_Student stu1 = new Test_3_11_Student(3,"William",65);
		Test_3_11_Student stu2 = new Test_3_11_Student(1,"Tom",87);
		Test_3_11_Student stu3 = new Test_3_11_Student(2,"Lucy",95);
		Set set = new HashSet();
		//将Student类的对象添加到集合中
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		//使用迭代器显示Student类的对象中的内容
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
