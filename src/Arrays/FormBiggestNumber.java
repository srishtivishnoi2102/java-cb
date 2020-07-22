package Arrays;

import java.util.Scanner;

/*
You are provided an array of numbers. You need to arrange them in a way that yields the largest value.

Input Format
First line contains integer t which is number of test case.
For each test case, you are given a single integer n in the first line which is the size of array A[] and next line contains n space separated integers denoting the elements of the array A .

Constraints
1<=t<=100
1<=m<=100
1<=A[i]<=10^5

Output Format
Print the largest value.

Sample Input
1
4
54 546 548 60
Sample Output
6054854654

*/
public class FormBiggestNumber {
	public static boolean compareXY(String x,String y) {
		String xy=x+y;
		String yx=y+x;
		
		if(xy.compareTo(yx)<0) {  // xy<yx   sort them
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					String x=Integer.toString(a[i]);
					String y=Integer.toString(a[j]);
					if(compareXY(x, y)) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			for(int i=0;i<n;i++) {
				System.out.print(a[i]);
			}
			
			
			
		}
		sc.close();

	}

}
