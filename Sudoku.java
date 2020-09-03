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
	//length function needed so inside main function can return array length
	public int length(){
		return puzzle.length;
	}
	
	//Function will return if there's an empty space & returns when at the first case its tru
	//Need to change to return the location of the open space
	public int emptyspace(int row){
		//for(int i=0; i<puzzle.length; i++)
		for(int j=0; j<puzzle.length; j++)
			if(puzzle[row][j] == EMPTY)
				return j;
			
		return -1;				
	}
	public int fillBoard(int row, int col, int num){
		
		//for(int i=1; i<10; i++){}
		//int num = 1;
		puzzle[row][col]= num;
		if(checkRow(row, col, num))
			//|| checkCol(row, col, num) || checkGrid(row, col, num))
			return num;

		

		return -1;
		//fillBoard();
	}
	public int fillBoard(){
		//new functions
		//base case: empty space ->fill in 1-9
		int row = 0;
		// int col = board.emptyspace(row);
		// System.out.println(col);
		while(board.emptyspace(row) != -1){
			for(int num=1; num<10; num++){
				int col = board.emptyspace(row);
				//puzzle[row][board.fillBoard(row, col, num)];
				board.fillBoard(row, col, num);
			}
			
			row++;
		}
	}

	public boolean checkRow(int row, int col, int pos){
		for(int i=0; i< puzzle.length; i++)
			if(puzzle[row][col] == pos)
				return true;
		return false;
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


	public static void main(String[] args){
		//instantiating the board allows the user to fill in spaces for sudoku board
		Sudoku board = new Sudoku();
		System.out.println(board);
		
		board.fillboard(); //no args
		System.out.println(board);
		
		System.out.println("end.");
	}	
}