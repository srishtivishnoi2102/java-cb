package Arrays;

import java.util.Scanner;

public class NextGreatestNumber {

	public static void swap(char[] x,int i,int j) {
		char temp=x[i];
		x[i]=x[j];
		x[j]=temp;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
	

		String str=sc.nextLine();
		char[] n=new char[str.length()];
		int i;
		for(i=0; i<n.length; i++) {
			n[i]=str.charAt(i); // converting string into char array
		}
		
		// from the rightmost end, search for the ith index such that value at ith index is greater than the left (i-1)th index.
		// if index i comes out to 0, then second largest number is not possible
		for( i=n.length -1; i>0; i--) {
			if(n[i]>n[i-1]) {
				break;
			}
		}
		
		if(i==0) {
			System.out.println("NO NEXT GREATES NUMBER EXISTS");
		}else {
			int index_of_interest=i-1;
			int min_index=n.length-1;
			
			System.out.println("index of interest is : "+(i-1));
			System.out.println(n[i-1]);
			//now we have to find the index of element right to index (i-1) which is least greater than element at index of interest
			for (int k=n.length-1; k>index_of_interest; k--) {
				System.out.println(n[k]);
				if(n[k]>n[index_of_interest]  ) {
					min_index=k;
					break;  //6512
				}
			}			
			swap(n, index_of_interest, min_index);
			String s=new String(n);
			System.out.println("after swapping  : "+ s);
			//reverse the remaining string after the index_of_interest
			String res="";
			for(int j=0; j<=index_of_interest; j++) {
				res=res+n[j];
			}
			for(int j=n.length-1; j>index_of_interest; j--) {
				res=res+n[j];
			}			
			System.out.println("next greatest number: "+res);
		}	
		sc.close();
	}
}
