package basics;
import java.util.*;
/* *Given a number n, the task is to find out whether this number is smith or not. A Smith Number is a composite number whose sum of digits is equal to the sum of digits in its prime factorization.
Examples:

Input  : n = 4
Output : Yes
Prime factorization = 2, 2  and 2 + 2 = 4
Therefore, 4 is a smith number

Input  : n = 6
Output : No
Prime factorization = 2, 3  and 2 + 3 is
not 6. Therefore, 6 is not a smith number

Input   : n = 666
Output  : Yes
Prime factorization = 2, 3, 3, 37 and
2 + 3 + 3 + (3 + 7) = 6 + 6 + 6 = 18
Therefore, 666 is a smith number

Input   : n = 13
Output  : No
Prime factorization = 13 and 13 = 13,
But 13 is not a smith number as it is not
a composite number
*/
import java.lang.*;
public class SmithNumber {
	static boolean  isPrime(int t){
		if(t==2){
			return true;
		}
		for(int i=2;i<=(int)Math.sqrt(t);i++){
			if(t%i==0)
				return false;
		}
		return true;
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int sum_digits=0;
		while(temp>0){
			sum_digits+=(temp%10);
			temp/=10;
		}
		temp=num;
		int prime_sum=0;
		for(int i=2; i<=(num/2) && temp>1 ;i++ ){
			if(isPrime(i)){

				while(temp%i==0){
					temp/=i;
					int digtemp=i;
					while(digtemp>0) {
						prime_sum+=(digtemp%10);
						digtemp/=10;
					}
				}
			}
		}
		if(prime_sum==sum_digits){
			System.out.println(1);

		}else{
			System.out.println(0);

		}

    }
}