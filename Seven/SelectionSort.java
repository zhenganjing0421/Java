package seven;

public class SelectionSort {
    /** The method for sorting the numbers */
	public static void SelectionSort(double[] list) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.length -1;i++) {
			//Find the minimum in the list[i..list.length-1]
			double currentMinIndex = i;
			
		for(int j = i+1; j<list.length ; j++) {	
			if(currentMin > list[j]) {
				currentMin = list[j];
				currentMinIndex = j;
			}
		}
		
		//Swap list[i] with list[currentMinIndex] if necessary
		if(currentMinIndex != i) {
			list[currentMinIndex] = list[i];
			list[i] = currentMin;
		}
	  }
   }
}
