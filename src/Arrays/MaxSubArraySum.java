package Arrays;

public class MaxSubArraySum {
	public static int maxSubArraySum(int[] arr) {
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum+=arr[k];
				}
				if(sum>maxsum) {
					maxsum=sum;
				}
			}
		}
		
		return maxsum;
	}
	public static void main(String[] args) {
		int[] arr= {-1,4,2,-13,100,-22,3,1};
		
		System.out.println(maxSubArraySum(arr));
	}

}
