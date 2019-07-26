package cn.edu360.javase24.day08.sortutil1;
//用户自定义的按照年龄排序
public class AgeBijiaoQi implements BijiaoQi{
	
	@Override
	public boolean bijiao(User u1, User u2) {
		if(u1.getAge()>u2.getAge()){
			return true;
		}
		return false;
	}
	
	
}
