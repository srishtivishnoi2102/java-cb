package Array2D;

public class SpiralPrint {
	public static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("srishti");
		
		
	
		int[][] arr= {
				{11, 12, 13, 14},
				{21, 22, 23, 24},
				{21, 22, 23, 24},
				{21, 22, 23, 24},
				{31, 32, 33, 34},
				{41, 42, 43, 44}};
		System.out.println("Array :");
		display(arr);
		System.out.println("Wave Print col-wise");
		spiral_print(arr);
		

	}


	private static void spiral_print(int[][] arr) {
		// TODO Auto-generated method stub
		int row=arr.length;
		if(row==0) {
			return;
		}
		int col=arr[0].length;
		
		int left=0; int right=col-1;
		int top=0; int bottom=row-1;
		int count=row*col;
		int dir=0;
		while(left<=right && top <=bottom) {
			if(count>0) {
				if(dir==0) {		//move left to right
					for(int i=left;i<=right;i++) {
						System.out.print(arr[top][i]+", ");
						count--;
					}
					top++;
					dir=1;
				}
			}
			if(count>0) {
				if(dir==1) {   //move top to bottom 
					for(int i=top;i<=bottom;i++) {
						System.out.print(arr[i][right]+", ");
						count--;
					}
					right--;
					dir=2;
				}
			}
			if(count>0) {
				if(dir==2) {	//move right to left
					for(int i=right;i>=left;i--) {
						System.out.print(arr[bottom][i]+", ");
						count--;
					}
					bottom--;
					dir=3;
				}
			}
			if(count>0) {
				if(dir==3) {	//move bottom to top
					for(int i=bottom;i>=top;i--) {
						System.out.print(arr[i][left]+", ");
						count--;
					}
					left++;
					dir=1;
				}
			}
		}
		System.out.println("END");
			
		
	}

}
