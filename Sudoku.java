import java.util.Scanner;
public class Sudoku{
	private int[][] puzzle; 

	public Sudoku(){
		Scanner fill = new Scanner(System.in); // allow user to fill in solved solutions
		puzzle = new int[2][2]; //declares the 9x9 array

		for (int i=0; i<puzzle.length;i++)
			for(int j=0; j<puzzle.length; j++){
				System.out.println("Enter value for [" +
					i +"]["+ j +"]. If solution is blank enter '0'");
				fill.nextInt();
			}



		// puzzle[0][0] = 7;
		// puzzle[0][1] = 4;
		// puzzle[0][4] = 3;
		// puzzle[0][7] = 1;

		// puzzle[1][1] = 1;
		// puzzle[1][2] = 9;
		// puzzle[1][4] = 6;
		// puzzle[1][5] = 8;
		// puzzle[1][6] = 5;
		// puzzle[1][8] = 2;

		// puzzle[2][5] = 4;
		// puzzle[2][6] = 3;

		// puzzle[3][1] = 5;
		// puzzle[3][2] = 6;
		// puzzle[3][3] = 3;
		// puzzle[3][4] = 7;
		// puzzle[3][8] = 1;

		// puzzle[4][2] = 1;
		// puzzle[4][3] = 8;
		// puzzle[4][7] = 9;
		// puzzle[4][8] = 5;

		// puzzle[5][1] = 9;
		// puzzle[5][4] = 2;
		// puzzle[5][6] = 6;

		// puzzle[6][0] = 1;
		// puzzle[6][2] = 3;
		// puzzle[6][3] = 4;
		// puzzle[6][5] = 7;
		// puzzle[6][6] = 2;

		// puzzle[7][0] = 5;
		// puzzle[7][3] = 2;
		// puzzle[7][8] = 8;

		// puzzle[8][1] = 8;
		// puzzle[8][5] = 1;
		// puzzle[8][6] = 4;
		// puzzle[8][7] = 7;

	//}
	// public boolean empty(int r){
	// 	for(int i=0; i<puzzle.length; i++)
	// 		puzzle[r]
	}

	public String toString(){
		String output = " ";
		for(int row =0; row<puzzle.length; row++){
			output += "\n";
			for(int col = 0; col<puzzle[row].length; col++)
				output+= puzzle[row][col] + "\t";
		}
		return output;	
	}
		
}