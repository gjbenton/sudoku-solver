import java.util.*;
public class Play{
	public static void main(String[] args){
		Sudoku board = new Sudoku();
		System.out.println(board);

		//while(!board.complete()) // write  a function for whehn the board is complete
		//
			if(board.emptyspace())
				System.out.println("found an empty space!");
			
			

			else
				System.out.println("no empty spaces");
		
		//}


		

	}

}