package Arrays;

public class linearSearch {
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"    ");
		}
		System.out.println();
	}
	public static void lsearch(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.printf("Element %d found at %d index\n",key,i);
				return;
			}
		}
		System.out.printf("Element %d not found\n",key);

	}
		
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4,5,6,7,8,9};
		System.out.println("Array  : ");
		display(arr);
		lsearch(arr, 55);
		lsearch(arr, 5);
		lsearch(arr, 15);
		lsearch(arr, 9);
		
		
		

	}

}
