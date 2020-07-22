package patterns;

import java.util.Scanner;

/*
 * Take as input N, a number. Print the pattern as given in the input and output section.
for n=7,  Output: 
 1******
 12*****
 123****
 1234***
 12345**
 123456*
 1234567
 
 */
public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int row=1; row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if(col<=row) {
					System.out.print(col);
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

}
