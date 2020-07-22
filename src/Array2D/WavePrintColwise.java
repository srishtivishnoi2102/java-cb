package Array2D;

public class WavePrintColwise {

	public static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}
	private static void wave_col_wise(int[][] arr) {
		int row=arr.length;
		if(row==0) {
			return;
		}
		int col=arr[0].length;
		System.out.println(row);
		System.out.println(col);
		for(int c=0;c<col;c++) {
			if(c%2==0) { // move top to bottom
				for(int r=0;r<row;r++) {
					System.out.print(arr[r][c]+"\t");
				}	
			}else {    // move bottom to top
				for(int r=row-1; r>=0;r--) {
					System.out.print(arr[r][c]+"\t");
				}	
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{8,9,0,1,2},{8,9,0,1,2},{8,9,0,1,2},{1,2,3,5,6}};
		System.out.println("Array :");
		display(arr);
		System.out.println("Wave Print col-wise");
		wave_col_wise(arr);

	}

}
