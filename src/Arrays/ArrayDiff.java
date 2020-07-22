package Arrays;

import java.util.*;
public class ArrayDiff {
    public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int[] a1=new int[n1];
		for(int i=0;i<n1;i++){
			a1[i]=sc.nextInt();
		}
		int n2=sc.nextInt();
		int[] a2=new int[n2];
		for(int i=0;i<n2;i++){
			a2[i]=sc.nextInt();
		}
		if(n1>n2){
			int nt=n1;
			n1=n2;
			n2=nt;
			int[] temp=a1;
			a1=a2;
			a2=temp;	
		}
		int i=0;
		while(i<n2-n1) {
			System.out.print(a2[i]+", ");
			i++;
		}
		int j=0;
		while(i<n2) {
			System.out.print(a2[i]+a1[j]+", ");
			i++;
			j++;
			
		}
		

		System.out.print("END");
		sc.close();


    }
}