package patterns;

import java.util.Scanner;

/*
 * Take N (number of rows), print the following pattern (for N = 4).

                       1           1
                       1 2       2 1  
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1   
 */
public class PatternMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=n;c++) {
				if(c<=r) {
					System.out.print(c);
				}else {
					System.out.print(" ");
				}
			}
			for(int c=n-1;c>0;c--) {
				if(c<=r) {
					System.out.print(c);
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}

	}

}
