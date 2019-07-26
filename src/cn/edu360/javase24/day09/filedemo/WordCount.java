package cn.edu360.javase24.day09.filedemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 统计文件中每个单词出现的次数   wordcount
 * 思路
 * 1	首先读取文件拿到文件中的每一行
 * 2	然后对一行数据进行切分
 * 3	把切分后的数据放到hashmap 中（如果没有就放入value=1  有的话就value+1）
 * @author Administrator
 *
 */
public class WordCount {
	
	public static void main(String[] args) throws Exception {
		HashMap<String, Integer> count = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/a.txt")));
		String line = "";
		while((line=br.readLine())!=null){
			String[] words = line.split(" ");
			for(String tmp:words){
				//hashmap中如果有这个单词
				if(count.containsKey(tmp)){
					Integer value = count.get(tmp);
					count.put(tmp, value+1);
				}else {
					count.put(tmp, 1);
				}
				
				
			}
		}
		//关流
		br.close();
		//打印结果
		Set<Entry<String, Integer>> set = count.entrySet();
		for(Entry<String, Integer> ent:set){
			System.out.println(ent.getKey()+":"+ent.getValue());
		}
	}
}
