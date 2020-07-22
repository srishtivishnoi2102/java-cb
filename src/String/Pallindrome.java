package String;

import java.util.Scanner;

public class Pallindrome {
	private static boolean isPallindrome(String temp) {
		int left=0;int right=temp.length()-1;
		while(left<right) {
			if(temp.charAt(left) != temp.charAt(right) )
				return false;
			
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(isPallindrome(str));
		
	}

}
