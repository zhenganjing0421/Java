package one_two;

public class J_Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=8;
		int day=1;
		if((month==8)||(++day<15))
			System.out.println("Month="+month+", Day="+day);			
		if((month==8)|(++day<15))
			System.out.println("Month="+month+", Day="+day);	

	}//方法main结束
}//类J_Boolean结束
