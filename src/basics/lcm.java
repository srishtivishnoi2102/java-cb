package basics;

import java.util.*;
public class lcm {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		if(a<b){
			long t=b;
			b=a;
			a=t;
		}
		long ta=a;
		long tb=b;
		while(tb>0){
			long temp=ta;
			ta=tb;
			tb=temp%tb;
		}
		long lcm=a*b;
		if(ta!=0){
			lcm=lcm/ta;
		}
		System.out.println(lcm);
    }
}