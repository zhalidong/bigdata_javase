package cn.edu360.javase24.day08.sortutil3;

import java.util.ArrayList;
/**
 * 不用传比较器的自定义排序框架
 * 前提是User类本身要包含一个比大小的方法:bijiao()
 * @author Administrator
 *
 */
public class SortUtil3 {
	
	public void sort(ArrayList<User> ulist){
		for(int i=0;i<ulist.size()-1;i++){
			for(int j=0;j<ulist.size()-i-1;j++){
				//使用User类中的比较方法
				int res = ulist.get(j).bijiao(ulist.get(j+1));
				if(res>0){
					User tmp = ulist.get(j);
					ulist.set(j, ulist.get(j+1));
					ulist.set(j+1, tmp);
					
				}
				
				
			}
		}
	}
	
}
