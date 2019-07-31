package cn.edu360.javase24.day14.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
 * 匿名内部类的使用方式;
 * 可以使用一个普通类产生一个匿名子类 然后构造对象
 * 也可以用一个接口产生一个匿名实现类 然后构造对象
 */
public class AnnonymouseClass {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Person p = new Person(){};		//表示一个匿名内部类的类体
		
		//匿名内部类
		Person p2 = new Person(){
			@Override
			public void say() {
				System.out.println("我是美国人"+this.name);
			}
		};
		
		p2.name="jamous";
		p2.say();
		
		/*
		 * 对接口使用匿名内部类创建对象
		 * 
		 */
		ArrayList<Person> pList = new ArrayList<>();
		
		Collections.sort(pList,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return 0;
			}
		});
		
		
	}
	
}
