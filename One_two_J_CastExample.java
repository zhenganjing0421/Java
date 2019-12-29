package one_two;

public class J_CastExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a=100;
    	long b=a;//隐形类型转换    	
    	System.out.print("类型转换：短整数"+a+"变成长整数"+b+"\n");  
    	
        b=123456789L;
        a=(short)b;//显式类型转换，强制类型转换       
        System.out.print("类型转换：长整数"+b+"变成短整数"+a);
        
	}//方法J_CastExample结束
}//类one结束
