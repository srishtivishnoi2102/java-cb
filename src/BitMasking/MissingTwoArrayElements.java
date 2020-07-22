package BitMasking;

public class MissingTwoArrayElements {
	public static void missingNumber(int[] arr) {
		int n=arr.length+2;
		int xor=0;
		for(int i=0;i<arr.length;i++) {
			xor=xor^arr[i];
		}
		for(int i=1;i<=n;i++) {
			xor=xor^i;
		}
		
		int set_rightmost_bit= xor & ~(xor-1);
		int group1=0;
		int group2=0;
		
		for(int i=0;i<arr.length;i++) {
			if( (arr[i] & set_rightmost_bit) >0 ) {
				group1=group1^arr[i];
			}else {
				group2=group2^arr[i];
			}
		}
		
		for(int i=1;i<=n;i++) {
			if( (i & set_rightmost_bit) >0 ) {
				group1=group1 ^ i ;
			}else {
				group2=group2 ^ i ;
			}
		}
		System.out.println(group1);
		System.out.println(group2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,5,2,8,6};
		missingNumber(arr);

	}

}
