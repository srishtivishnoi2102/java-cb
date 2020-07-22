package BitMasking;

import java.util.Scanner;

//Rightmost1bit(z) = ( z & not (z-1))

public class Rightmost1bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int mask=1;
		int pos=1;
		if(num<1) {
			System.out.println("No set bit exists");
			return;
		}
		
		while( (num & mask) ==0) {
			mask=mask<<1;
			pos++;
		}
		System.out.println("Position is : "+pos);

	}

}
