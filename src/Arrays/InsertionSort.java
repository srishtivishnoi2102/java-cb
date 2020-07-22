package Arrays;
// after every nth pass, nth smallest element will be at nth index.

public class InsertionSort {
	
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
		int[] arr= {9,8,7,6,5};
		System.out.println("Before   : ");
		display(arr);
		insertion_sort(arr);
		System.out.println("After   : ");
		display(arr);
		
		
	}

	private static void insertion_sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int pass=1;pass<arr.length;pass++) {
			System.out.println("Pass:  "+pass);
			for(int index=pass;index>0 && arr[index-1]>arr[index] ;index--) {
				
				swap(arr, index, index-1);
				display(arr);
			}

		}
	}

}
