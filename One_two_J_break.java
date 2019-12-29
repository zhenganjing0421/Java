package one_two;

public class J_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;//定义变量i，并赋初值0
		aBreakBlock:
		{
			System.out.println("在break语句之前");
			if(i<=0)
				break aBreakBlock;
			System.out.println("在if和break语句之后");
		}//语句块aBreakBlock结束
		System.out.println("在aBreakBlock语句块之后");

	}//方法main结束

}//类J_Break结束
