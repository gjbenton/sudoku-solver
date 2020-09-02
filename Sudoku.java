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
				puzzle[i][j] = fill.nextInt();
			}
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