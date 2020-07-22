package patterns;
/*
 * 
 * 
 *  Take N as input. For a value of N=5, we wish to draw the following pattern :

             5                   5 
             5 4               4 5 
             5 4 3           3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2 1 0 1 2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3           3 4 5 
             5 4               4 5 
             5                   5 
       
 *  
 */

import java.util.Scanner;

public class InvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int r=n;r>=0;r--) {
			for(int c=n;c>=0;c--) {
				if(c>=r) {
					System.out.print(c+" ");
				}else {
					System.out.print("  ");
				}
			}
			for(int c=1;c<=n;c++) {
				if(c>=r) {
					System.out.print(c+" ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println("");
		}
		
		for(int r=1;r<=n;r++) {
			for(int c=n;c>=0;c--) {
				if(c>=r) {
					System.out.print(c+" ");
				}else {
					System.out.print("  ");
				}
			}
			for(int c=1;c<=n;c++) {
				if(c>=r) {
					System.out.print(c+" ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println("");
			
		}

	}

}