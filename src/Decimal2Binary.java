import java.util.Scanner;

public class Decimal2Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number in decimal : ");
		long d_num =sc.nextInt();
		long b_num=0;
		long powerof10=1;  
		while(d_num!=0) {
			long rem=d_num%2;
			b_num=b_num+ powerof10*(rem);
			d_num/=2;
			powerof10*=10;
		}
		System.out.println("It's binary conversion : "+b_num);
		sc.close(); 		
	}

}
