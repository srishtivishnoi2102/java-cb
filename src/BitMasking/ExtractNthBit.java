package BitMasking;

public class ExtractNthBit {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=15;
		int pos=4;
		int mask=1;
		int req_mask=mask << (pos-1);     //left shifting to create required mask 
		if((num&req_mask)==0) {
			System.out.println(pos+"th bit from left in the given number "+num+" is 0");
		}
		else {
			System.out.println(pos+"th bit from left in the given number "+num+" is 1");
		}

	}

}
