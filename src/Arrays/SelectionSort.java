package Arrays;
// after every nth pass, nth smallest element will be at nth index.

public class SelectionSort {
	
	public static void display(int[] arr) { 
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"    ");
		}
		System.out.println();
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {9,7,3,2};
		System.out.println("Before   : ");
		display(arr);
		selection_sort(arr);
		System.out.println("After   : ");
		display(arr);
		
		
	}

	private static void selection_sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int pass=0;pass<arr.length-1;pass++) {
			int minIndex=pass;
			int index;
			for(index=pass+1;index<arr.length;index++) {
				if(arr[index]<arr[minIndex]) {
					minIndex=index;
				}
			}
			if(arr[pass]>arr[minIndex]) {
				swap(arr, minIndex,pass);
			}
//			display(arr);

		}
	}

}
