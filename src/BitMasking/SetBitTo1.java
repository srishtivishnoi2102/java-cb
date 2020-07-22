package BitMasking;

public class SetBitTo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=16;
		int pos=2;
		int mask=1<<(pos-1);
		int num2=num | mask;
		System.out.println("before : "+num);
		System.out.println("After setting the "+pos+"th bit to 1,the number become : "+num2);
	}

}
