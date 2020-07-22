package Arrays;

public class arrayReverseWhile {

	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"    ");
		}
	}
		
	public static void main(String[] args) {
		int[] myarr= {0,1,2,3,4,5,6,7,8,9};
		System.out.println("Before  : ");
		display(myarr);
		
		int i=0;
		int j=myarr.length-1;
		while(i<=j) {
			int temp=myarr[i];
			myarr[i]=myarr[j];
			myarr[j]=temp;
			i++;
			j--;
		}
		
		System.out.println("\nAfter  : ");
		display(myarr);
		
		

	}

}
