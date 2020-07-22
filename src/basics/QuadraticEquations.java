package basics;

import java.util.Scanner;

/* Given coefficients of a quadratic equation , you need to print the nature of the roots (Real and Distinct , Real and Equal or Imaginary) and the roots.
If Real and Distinct , print the roots in increasing order.
If Real and Equal , print the same repeating root twice
If Imaginary , no need to print the roots.

Note : Print only the integer part of the roots.

Input Format
First line contains three integer coefficients a,b,c for the equation
 ax^2 + bx + c = 0.
*/
public class QuadraticEquations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=b*b -4*a*c;
		if(d<0) {
			System.out.println("Imaginary");
		}else if(d==0) {
			System.out.println("Real and Equal");
			int x=0-(b/(2*a));
			System.out.println(x+" "+x);
		}else {
			System.out.println("Real and Distinct");
			double tempd= Math.sqrt(d);
			int x1=(int) ((0-b+tempd)/(2*a));
			int x2=(int) ((0-b-tempd)/(2*a));
			if(x1>x2) {
				System.out.println(x2+" "+x1);
			}else {
				System.out.println(x1+" "+x2);
			}
			
		}
		

	}

}
