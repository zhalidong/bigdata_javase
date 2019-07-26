package cn.edu360.javase24.day08.sortutil2;

public class AgeBijiaoqi implements BijiaoQi<User>{

	@Override
	public boolean bijiao(User O1, User O2) {
		if(O1.getAge()>O2.getAge()){
			return true;
		}
		return false;
	}

}
