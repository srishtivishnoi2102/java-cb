package BitMasking;

public class Count_Set_Bits {
	public static void count_set_bits(int num) {
		int count=0;
		int mask=1;
		
		while(mask<=num) {
			if( (num & mask ) != 0) {
				count++;
			}
			mask=mask<<1;
		}
		System.out.println("Number of set bits in "+num+" is "+count);

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count_set_bits(6);
		count_set_bits(16);
		count_set_bits(15);

	}

}
