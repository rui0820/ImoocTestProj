package Test_3_4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test_4_4_FootballDemo {

	public static void main(String[] args) {
		//定义HashMap的对象并添加数据
       Map<String,String> footBall = new HashMap();
       footBall.put("2014", "德国");
       footBall.put("2010", "西班牙");
       footBall.put("2006", "意大利");
       footBall.put("2002", "巴西");
       footBall.put("1998", "法国");
		//使用迭代器的方式遍历
       System.out.println("使用迭代器方式进行输出：");
		Iterator<String> it = footBall.values().iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		//使用EntrySet同时获取key和value
	    System.out.println("使用EntrySet进行输出：");
		Set<Entry<String,String>> entrySet = footBall.entrySet();
		for(Entry<String,String> entry:entrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}
}
