package one_two;
public class J_Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=123;
		int b=321;
		System.out.println("a="+a+", b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a="+a+", b="+b);

	}//方法main结束

}//类J_Swap结束
