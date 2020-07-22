package patterns;

import java.util.Scanner;

/*
 * Take N (number of rows), print the following pattern (for N = 4)
0
1 1
2 3 5
8 13 21 34
 * 
 */
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fib[]=new int[1+ (int)(num*(num+1))/2];
		fib[0]=0;
		fib[1]=1;
		int counter=0;
		for(int row=1; row<=num;row++) {
			for(int col=1;col<=row;col++) {
				if(counter>1) {

					fib[counter]=fib[counter-1]+fib[counter-2];
				}
				
				System.out.print(fib[counter]+"\t");
				counter++;
			}
			System.out.println("");
		}

	}

}
