package cn.edu360.javase24.day08.sortutil1;

public class SalaryBijiaoQi implements BijiaoQi{

	@Override
	public boolean bijiao(User u1, User u2) {
		if(u1.getSalary()>u2.getSalary()){
			return true;
		}
		return false;
	}
	
}
