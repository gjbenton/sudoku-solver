/* Sudoku.java purpose is to use recursive backtracking to fill in unsolved
solution spaces on an existing sudoku board.
*/
import java.util.Scanner;
public class Sudoku{
	private int[][] puzzle;
	// private int[][] puzzle = {
	// 	{3, 0, 6, 5, 0, 8, 4, 0, 0},
	// 	{5, 2, 0, 0, 0, 0, 0, 0, 0},
	// 	{0, 8, 7, 0, 0, 0, 0, 3, 1},
	// 	{0, 0, 3, 0, 1, 0, 0, 8, 0}, 
	// 	{9, 0, 0, 8, 6, 3, 0, 0, 5},
	// 	{0, 5, 0, 0, 9, 0, 6, 0, 0}, 
	// 	{1, 3, 0, 0, 0, 0, 2, 5, 0}, 
	// 	{0, 0, 0, 0, 0, 0, 0, 7, 4}, 
	// 	{0, 0, 5, 2, 0, 6, 3, 0, 0} };

	private final int EMPTY = 0;
	private final int SIZE = 9;

	public Sudoku(){
		Scanner fill = new Scanner(System.in); // allow user to fill in solved solutions
		puzzle = new int[SIZE][SIZE]; //declares the 9x9 array 

		for (int i=0; i<puzzle.length;i++)
			for(int j=0; j<puzzle.length; j++){
				System.out.println("Enter value for [" +
					i +"]["+ j +"]. If solution is blank enter '0'");
				puzzle[i][j] = fill.nextInt();
		}
	}
	public boolean fillBoard(){
		//finds empty space
		for(int row = 0; row<puzzle.length; row++){
			for(int col = 0; col<puzzle.length; col++){
				if(puzzle[row][col] == EMPTY){
					//System.out.print(puzzle[row][col]);
					//now itereates through 1-9
					
					for(int num = 1; num <= SIZE; num++){
						//validates num
						if(checkRow(row, num) && checkCol(col, num) && checkGrid(row, col, num)){
							puzzle[row][col]= num;
							//System.out.print(puzzle[row][col]);
							if (fillBoard())
								return true;
							else
								puzzle[row][col] = EMPTY;
								//System.out.print(puzzle[row][col]);
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	public boolean checkRow(int row, int validate){
		for(int i=0; i< puzzle.length; i++){
			if(puzzle[row][i]== validate){
					return false;
			}	
		}
		return true;
	}
	public boolean checkCol(int col, int validate){
		for(int i=0; i<puzzle.length; i++){
			if(puzzle[i][col]==validate){
				return false;
			}
		}
		return true;
	}
	public boolean checkGrid(int row, int col, int validate){
		int gridRow = col/3;
		int gridCol = row/3;

		//This iterative loop allows i to be 0/3/6 depending on gridRow
		
		// for(int i=gridRow*3; i<(gridRow*3)+3; i++){
		// 	for(int j= gridCol*3; j<(gridCol*3)+3;j++)
		// 		if(puzzle[i][j]==validate)
		// 			return false;
		// }

		for(int i=gridCol*3; i<(gridCol*3)+3; i++){
			for(int j= gridRow*3; j<(gridRow*3)+3;j++)
				if(puzzle[i][j]==validate)
					return false;
		}
		return true;

	}

	public String toString(){
		String output = " ";
		for(int row =0; row<puzzle.length; row++){
			output += "\n";
			if(row%3==0)
				output += "-------------------------------------------------------------------\n";
			for(int col = 0; col<puzzle[row].length; col++){
				if(col%3==0)
					output += "| ";
				output+= puzzle[row][col] + "\t";	
			}
		}
		output += "\n-------------------------------------------------------------------";

		return output;	
	}


	public static void main(String[] args){
		//instantiating the board allows the user to fill in spaces for sudoku board
		Sudoku board = new Sudoku();
		System.out.println("Unsolved Sudoku Board");
		System.out.println(board);
		
		board.fillBoard();
		System.out.println("Sudoku Puzzle Solved!");
		System.out.println(board);
		//System.out.println("end.");

	}	
}