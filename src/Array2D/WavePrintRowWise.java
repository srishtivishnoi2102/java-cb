package Array2D;

public class WavePrintRowWise {
	public static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}
	private static void wave_row_wise(int[][] arr) {
		for(int r=0;r<arr.length;r++) {
			if(r%2==0) { // move left to right
				for(int c=0;c<arr[r].length;c++) {
					System.out.print(arr[r][c]+"\t");
				}	
			}else {    // move right to left
				for(int c=arr[r].length-1; c>=0;c--) {
					System.out.print(arr[r][c]+"\t");
				}	
			}
			System.out.println("");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{2,4,6},{8,9,0,1,2},{3,4,5,6},{7,8},{9,5,1,2,3,5,6}};
		System.out.println("Array :");
		display(arr);
		System.out.println("Wave Print Row-wise");
		wave_row_wise(arr);

	}

}
