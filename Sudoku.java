/* Sudoku.java purpose is to use recursive backtracking to fill in unsolved
solution spaces on an existing sudoku board.
*/
import java.util.Scanner;
public class Sudoku{
	private int[][] puzzle; 
	private final int EMPTY = 0;
	private final int SIZE = 9;

	public Sudoku(){
		Scanner fill = new Scanner(System.in); // allow user to fill in solved solutions
		puzzle = new int[2][2]; //declares the 9x9 array 

		for (int i=0; i<puzzle.length;i++)
			for(int j=0; j<puzzle.length; j++){
				System.out.println("Enter value for [" +
					i +"]["+ j +"]. If solution is blank enter '0'");
				puzzle[i][j] = fill.nextInt();
			}
	}
	
	//emptyspace() functionality checks for an empty space within a specific row
	//it will return the index of first empty space
	// public int emptyspace(int row){
	// 	for(int j=0; j<puzzle.length; j++)
	// 		if(puzzle[row][j] == EMPTY)
	// 			return j;

	// 	return -1;				
	// }
	public int fillBoard(int[][] puzzle, int row, int col){
		int num=1;
		boolean invalid = true;
		/*hoping that by making the while a boolean I can control both
		when num increases (1-9) and when to break the loop*/
		while(invalid)
		{
			puzzle[row][col] = num;
			if(!checkRow(row, col))
				num++;
			invalid = false;
		}
			//|| checkCol(row, col, num) || checkGrid(row, col, num))
			//return fillBoard(row, col, pos+1);

		return -1;
		//fillBoard();
	}
	public int fillBoard(){
		//finds empty space, calls fill board.
		for(int row = 0; row<puzzle.length; row++)
			for(int col = 0; col<puzzle.length; col++){
				if(puzzle[row][col] == EMPTY)
					return fillBoard(puzzle, row, col);
			}
		//when puzzle is complete it will just need to return back to main function
		return -1;
	}

	public boolean checkRow(int row, int col){
		// puzzle[row][col] != puzzle[i][col]
		/*the nested if statements checks to see if the value at the index
		matches the value of another index within the row. It double checks
		if the match is the index itself before returning a boolean. */
		for(int i=0; i< puzzle.length; i++){
			if(puzzle[row][col]==puzzle[i][col]){
				if(row!=i)
					return false;
			}	
		}
		return true;
	}
	//public boolean checkCol(int row, int col, int pos){}
	//public boolean checkGrid(int row, int col, int pos){}

	public String toString(){
		String output = " ";
		for(int row =0; row<puzzle.length; row++){
			output += "\n";
			for(int col = 0; col<puzzle[row].length; col++)
				output+= puzzle[row][col] + "\t";
		}
		return output;	
	}


	public static void main(String[] args){
		//instantiating the board allows the user to fill in spaces for sudoku board
		Sudoku board = new Sudoku();
		System.out.println(board);
		
		board.fillBoard(); //no args, second fillboard(args) called within first
		System.out.println(board);

		//System.out.println(board.emptyspace(0));
		System.out.println("end.");
	}	
}