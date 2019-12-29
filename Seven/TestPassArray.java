package seven;

public class TestPassArray {
    /**Main method*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1, 2};
		
		//Swap elements using the swap method
		System.out.print("Before invoking swap" +"\n");
		System.out.print("array is {" + a[0] + ", " + a[1] + "}" +"\n");
		swap(a[0],a[1]);                                                                              
		System.out.print("After invoking swap" +"\n");
		System.out.print("array is {" + a[0] + ", " + a[1] + "}" +"\n");  
		
		//Swap elements using the swapFirstTwoInArray method
		System.out.print("Before invoking swapFirstTwoInArray" +"\n");
		System.out.print("array is {" + a[0] + ", " + a[1] + "}" +"\n");
		swapFirstTwoInArray(a);
		System.out.print("After invoking swapFirstTwoInArray" +"\n");
		System.out.print("array is {" + a[0] + ", " + a[1] + "}");
	}
		
		/**Swap two variables*/
		public static void swap(int n1, int n2) {
			int temp=n1;
			n1=n2;
			n2=temp;
		}
		
		/**Swap the first two elements in the array */
		public static void swapFirstTwoInArray(int[] array) {
		    int temp=array[0];
			array[0]=array[1];
			array[1]=temp;
		}
		

}
