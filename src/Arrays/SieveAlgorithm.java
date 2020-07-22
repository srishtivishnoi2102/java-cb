package Arrays;

import java.util.Scanner;

public class SieveAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		boolean primes[] = new boolean[len+1]; 
        for(int i=0;i<=len;i++) 
            primes[i] = true;
        
		for(int i=2; i<=(int)Math.sqrt(len);i++) {
			
			if(primes[i]) {

				for(int j=i*i;j<=len;j+=i) {

					primes[j]= false;

				}
			}
		}
		System.out.println("Prime Number : ");
		for(int i=2;i<=len;i++) {
			if(primes[i])
				System.out.println(i);
		}
		
		char b='c'+500;
		System.out.println("b "+b);

		sc.close();
	}

}
