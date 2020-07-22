package patterns;

import java.util.Scanner;

/*
 * Take N (number of rows), print the following pattern (for N = 5).

     * * * * *
     * *   * *
     *       *
     * *   * *
     * * * * *
 */
public class HollowDiamondCumSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=n;c++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		sc.close();

	}

}
