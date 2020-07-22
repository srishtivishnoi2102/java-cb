package BitMasking;

public class OneUniqueElement {

//properties of xor
//num ^ num =0
//num ^ 0 =num

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,5,7,5,9,1,9,4,1};
		int ans=0;
		for(int i=0; i<arr.length; i++) {
			ans=ans^arr[i];
		}
		System.out.println(ans);
		
	}

}
