package Arrays;

import java.util.Scanner;

public class PrimeVisits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int count=0;
			if(a>b) {
				int temp=a;
				a=b;
				b=temp;
			}
			
			boolean primes[] = new boolean[b+1]; 
			primes[0]=false;
			primes[1]=false;
	        for(int i=2;i<=b;i++) 
	            primes[i] = true;
	        
			for(int i=2; i<=(int)Math.sqrt(b);i++) {
				
				if(primes[i]) {

					for(int j=i*i;j<=b;j+=i) {

						primes[j]= false;

					}
				}
			}
			for(int i=a;i<=b;i++) {
				if(primes[i]) {					
					count++;
			
				}
			}
			System.out.println(count);
			


		}
		sc.close();
		
		
		
		

	}

}
