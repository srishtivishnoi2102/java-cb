package Arrays;

public class arrayReverse {
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"    ");
		}
	}
	
	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	
	public static void main(String[] args) {
		int[] myarr= {0,1,2,3,4,5,6,7,8};
		System.out.println("Before  : ");
		display(myarr);
		for(int i=0;i<myarr.length/2;i++) {
			swap(myarr, i, myarr.length -i-1);
		}
		System.out.println("\nAfter  : ");
		display(myarr);
		
		

	}

}
