package cn.edu360.javase24.day04.function;

import java.util.ArrayList;

public class ListUtilsTest {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(9);
		list.add(10);
		list.add(20);
		list.add(18);
		
		
		ListUtils.sort(list);
		int max = ListUtils.getMax(list);
		
		System.out.println(max);
		
	}
}
