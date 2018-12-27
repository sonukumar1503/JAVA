package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String x[][] = new String [3][5];
		
		System.out.println(x.length); // 3 - Size of the row - 
		System.out.println(x[0].length);// 5 - Number of column present
		
		
		x[0][0] = "A0";
		x[0][1] = "B0";
		x[0][2] = "C0";
		x[0][3] = "D0";
		x[0][4] = "E0";
		
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";
		
		System.out.println(x[1][3]);
		System.out.println(x[2][2]);
		System.out.println(x[0][4]);
		
		System.out.println("******************************");
		
		// print all the value of 2-D array
		
		// row = 0 column = 0 to 4
		// row = 1 column = 0 to 4
		// row = 2 column = 0 to 4
		
		for (int i =0; i<x.length;i++){
			for(int j = 0; j<x[0].length;j++){
				System.out.print(x[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
