package Arrays;

// number of pass = length-1, i.e., pass belongs to [1,length-1]
// 1st pass will bring the 1st largest element at the     last index
// 2nd pass will bring the 2nd largest element at the 2nd last index
// 3rd pass will bring the 3rd largest element at the 3rd last index

public class BubbleSort {

	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"    ");
		}
		System.out.println();
	}
	public static void bubble_sort(int[] arr) {
		for(int pass=1; pass<=arr.length-1;pass++) {
			System.out.println("Pass: "+pass);
			int update_count=0;
			for(int currentIndex=0; currentIndex < arr.length-pass; currentIndex++) {
				if(arr[currentIndex]>arr[currentIndex+1]) { //swap the element if out of order
					int temp=arr[currentIndex];
					arr[currentIndex]=arr[currentIndex+1];
					arr[currentIndex+1]=temp;
					update_count++;					
				}
				display(arr);
			}
			if (update_count==0) return;	
		} 
	}
		
	public static void main(String[] args) {
		int[] arr= {1,1,6,5,1,7,4,3,2};
		System.out.println("Before   : ");
		display(arr);
		bubble_sort(arr);
		System.out.println("After   : ");
		display(arr);
		
		
		

	}

}
