package patterns;

import java.util.Scanner;

/*
 * Take N (number of rows), print the following pattern (for N = 6)

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

 */
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		int pascal[][]=new int[n][n];
		
		for(int row=0; row<n;row++) {
			
			for(int col=0;col<=row;col++) {
				if(col==0||row==col) {
					pascal[row][col]=1;
				}else {
					pascal[row][col]=pascal[row-1][col-1] + pascal[row-1][col];
				}


				
				System.out.print(pascal[row][col]+"\t");
				
				
			}
			System.out.println("");
		}

	}

}
