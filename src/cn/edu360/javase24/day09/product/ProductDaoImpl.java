package cn.edu360.javase24.day09.product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class ProductDaoImpl implements ProductDao{

	@Override
	public void addProduct(String line) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:/p.dat",true), "utf-8"));
		bw.write(line+"\r\n");
		bw.close();
		
	}

	@Override
	public ArrayList<Product> getAllProducts()  throws Exception{
		ArrayList<Product> plist = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/p.dat"),"utf-8"));
		String line="";
		while((line=br.readLine())!=null){
			String[] split = line.split(",");
			Product p = new Product(split[0], split[1], Float.parseFloat(split[2]));
			plist.add(p);
		}
		
		br.close();
		return plist;
	}

}
