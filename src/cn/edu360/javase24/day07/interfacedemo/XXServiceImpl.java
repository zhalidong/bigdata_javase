package cn.edu360.javase24.day07.interfacedemo;

import java.util.HashMap;
/**
 * 实现类通过
 * @author Administrator
 *
 */
public class XXServiceImpl implements XXService{

	@Override
	public String step1() {
		
		return "step1";
	}

	@Override
	public void step(String id) {
		
		System.out.println("step2");
	}

	@Override
	public HashMap<String, Integer> step3(int a) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("1", a);
		
		
		return map;
		
	}
	
}
