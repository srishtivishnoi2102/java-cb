package patterns;

import java.util.Scanner;

/*
 * Take as input N, a number. Print the pattern as given in output section for corresponding input.

Input Format
Enter value of N

Constraints
Output Format
All numbers and stars are Space separated

Sample Input
5
Sample Output
1 2 3 4 5
1 2 3 4 * 
1 2 3 * * *
1 2 * * * * *
1 * * * * * * *

 */
public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int r=n;r>0;r--) {
			int c=0;
			for(c=1;c<=r;c++) {
				System.out.print(c+" ");
			}
			for(int t=n-c;t>0;t--) {
				System.out.print("*"+" ");
			}
			for( c=r+1;c<=n;c++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
	}

}
