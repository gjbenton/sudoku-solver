import java.util.*;
public class Play{
	public static void main(String[] args){
		/*
		// // Testing functionality
		// int[][] puzzle = {{7,4,0},{0,1,9},{0,3,0}};
		// for (int i=0; i<puzzle.length;i++)
		// 	for(int j=0; j<puzzle.length; j++)
		// 		System.out.println("puzzle[" +i+"][" +j+"] = "
		// 						+ puzzle[i][j]);

		*/ 


		Sudoku board = new Sudoku();
		

		// int[][] arr = {{1,2, "."}, {".", 9, 8}};
		// for (int i=0; i<3; i++)
		// 	for (int j=0; j<3; j++)
		// 		System.out.print("arr[" +i+"][" +j+"]"
		// 						+ arr[i][j]);

		//solve for row 1:
		//if board.empty(0)

		System.out.print(board);

	}

}