package patterns;

import java.util.Scanner;

/*
Given number of rows N, you have to print a Hollow Rhombus. See the output for corresponding given input.


Sample Input
5
Sample Output
        * * * * * 
      *       * 
    *       * 
  *       * 
* * * * * 
end 
 */
public class Rhombus {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int r=1;r<=n;r++){
			 for(int c=1;c<=n-r;c++){
				 System.out.print("  ");
			 }
			 for(int c=1;c<=n;c++){
				 if(r==1 || r==n || c==1 ||c==n){
					 System.out.print("* ");
				 }else{
					 System.out.print("  ");
				 }
				 
			 }
			 System.out.println("");
		}

    }
}