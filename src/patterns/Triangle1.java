package patterns;

import java.util.Scanner;

/*
 * Take N (number of rows), print the following pattern (for N = 4).

                       1 
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4
 */
public class Triangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int r=1;r<=n;r++) {
			int temp=r;
			for(int c=1;c<n;c++) {
				if(c>n-r) {
					System.out.print(temp+" ");
					temp++;
				}else {
					System.out.print("  ");
				}
			}
			System.out.print(temp+" ");
			
			for(int c=1;c<r;c++) {
				temp--;
				System.out.print(temp+" ");
				
			}
			System.out.println("");
		}
		

	}

}
