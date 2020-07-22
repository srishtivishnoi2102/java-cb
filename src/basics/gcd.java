package basics;

import java.util.*;
public class gcd {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		long num1=sc.nextLong(); 
		long num2=sc.nextLong();
		if(num1<num2){
			long t=num1;
			num1=num2;
			num2=t;
		}
		while(num2>0){
			long temp=num1;
			num1=num2;
			num2=temp%num2;
		}
		System.out.println(num1);
		
		

    }
}