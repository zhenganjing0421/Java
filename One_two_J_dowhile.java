package one_two;

public class J_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=1;
		int sum=0;
		do
		{
			sum+=counter;
			counter++;
		}
		while(counter<=100);
		System.out.println("counter="+counter+"，sum="+sum);
	}

}
