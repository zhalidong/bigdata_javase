package cn.edu360.javase24.day09.filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) throws Exception {
		//	将路径描述成File对象
		//在win中/是可以使用的   用\不能使用是转义的意思
		File file = new File("d:/aaa/bbb/ccc");
		file.mkdirs();
		
		boolean b = file.isDirectory();
		System.out.println(b);
		
		//获取文件的绝对路径
		String path = file.getAbsolutePath();
		System.out.println(path);
		
		boolean file2 = file.isFile();
		System.out.println(file2);
		
		//获取文件名
		String name = file.getName();
		System.out.println(name);
		
		//获取上一级目录
		File file3 = file.getParentFile();
		System.out.println(file3.getAbsolutePath());
		
		
		String parent = file.getParent();
		System.out.println(parent);
		
		//获取文件长度	字节(8个bit -- 二进制位)
		long length = file.length();
		System.out.println(length);
		
		//获取指定目录下的子节点的名称字符串
		String[] s = file.list();
		for(String s1:s){
			System.out.println(s1);
		}
		
		//获取指定目录下的子节点的File描述对象
		File[] listfiles = file.listFiles();
		for(File f:listfiles){
			System.out.println(f.getAbsolutePath());
		}
		
		// 创建一个文件夹
		File f = new File("d:/xx/yy");
		f.mkdir();		//不能创建多级目录
		f.mkdirs();		//可以创建多级目录
		
		
		//创建文件
		File file4 = new File("d:/xx/yy/cls.avi");
		file4.createNewFile();
		
		//删除文件
		file4.delete();
		
	}
	
}
