package Arrays;

public class MissingArrayElements {
//		Approach-1
//		Step 1: Take a boolean array mark that keeps track of all the elements present in the array.
//		Step 2: Iterate from 1 to n, check for every element if it is marked as true in the boolean array, if not then simply display that element.
	public static void _2_missing_number_set1(int[] arr) {
		System.out.println("Finding Missing Element with Mask approach");
		int n=arr.length+2;
		boolean[] mask=new boolean[n+1];
		for(int i=0;i<n-2;i++) {
			mask[arr[i]]=true;
		}
		for(int i=1;i<=n;i++) {
			if(!mask[i]) {
				System.out.println(i);
			}
		}
	}
	
//		Approach-2
//		The idea is based on this popular solution for finding one missing numbers. We extend the solution so that two missing elements are printed.
//		Let’s find out the sum of 2 missing numbers:
//
//		arrSum => Sum of all elements in the array
//
//		sum (Sum of 2 missing numbers) = (Sum of integers from 1 to n) - arrSum
//		                               = ((n)*(n+1))/2 – arrSum 
//
//		avg (Average of 2 missing numbers) = sum / 2;
//		One of the numbers will be less than or equal to avg while the other one will be strictly greater then avg. Two numbers can never be equal since all the given numbers are distinct.
//		We can find the first missing number as sum of natural numbers from 1 to avg, i.e., avg*(avg+1)/2 minus the sum of array elements smaller than avg
//		We can find the second missing number by subtracting first missing number to sum of missing numbers
//		Consider an example for better clarification
//
//		Input : 1 3 5 6, n = 6
//		Sum of missing integers = n*(n+1)/2 - (1+3+5+6) = 6.
//		Average of missing integers = 6/2 = 3.
//		Sum of array elements less than or equal to average = 1 + 3 = 4
//		Sum of natural numbers from 1 to avg = avg*(avg + 1)/2
//		                                     = 3*4/2 = 6
//		First missing number = 6 - 4 = 2
//		Second missing number = Sum of missing integers-First missing number
//		Second missing number = 6-2= 4
	public static void _2_missing_number_set2(int[] arr) {
		System.out.println("Finding Missing Element with Average approach");
		int temp=0;
		int n=arr.length+2;
		for(int i=0;i<arr.length;i++) {
			temp+=arr[i];
		}
		int sum=(n*(n+1))/2;
		int sum_ab=sum-temp;
		int avg_ab=sum_ab/2;
		int sum_1_avg=(avg_ab*(avg_ab+1))/2;
		int temp_sum_1_avg=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=avg_ab) {
				temp_sum_1_avg+=arr[i];
			}
		}
		int a =sum_1_avg-temp_sum_1_avg;
		int b=sum_ab-a;
		System.out.println("First number is a: "+a);
		System.out.println("Second number is b: "+b);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,7,2,8,10,5,6};
		_2_missing_number_set1(arr);
		_2_missing_number_set2(arr);
	}

}
