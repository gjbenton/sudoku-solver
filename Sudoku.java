import java.util.Scanner;
public class Sudoku{
	private int[][] puzzle; 
	private final int EMPTY = 0;

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
	
	//Function will return if there's an empty space & returns when at the first case its tru
	//Need to change to return the location of the open space
	public boolean emptyspace(){
		for(int i=0; i<puzzle.length; i++)
			for(int j=0; j<puzzle.length; j++)
				if(puzzle[i][j] == EMPTY)
					return true;
			
		return false;				
	}
	public boolean one_nine()
	// public boolean column(){
	// 	for()
	// }

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