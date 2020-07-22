package basics;
import java.util.*;
public class sumOfEvenAndOdd{
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		int count=0;
		int even=0;
		int odd=0;
		while(num>0){
			count++;
			if(count%2==0){
				even+=(num%10);
			}else{
				odd+=(num%10);
			}
			num/=10;
		}

		System.out.println("ODD SUM  :  "+odd);
		System.out.println("EVEN SUM  :  "+even);

    }
}
