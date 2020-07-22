package Arrays;

public class sortingInLinearTime {
	
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"    ");
		}
		System.out.println();
	}
	
	public static void swap(int[] arr, int i ,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0x000F;
		int v=0x2222;
		System.out.println(v&m);
		
		int[] arr= {1,0,2,1,1,0,2,1,1,0,1,2};
		System.out.println("Before:  ");
		display(arr);
		int low=0;
		int mid=0;
		int high=arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				swap(arr,low,mid);
				low++;
				mid++;
				
				
			}else if(arr[mid]==1) {
				mid++;
				
			}else if(arr[mid]==2) {
				swap(arr,mid,high);
				high--;
				
			}
			
		}
		System.out.println("After : ");
		display(arr);

	}

}


