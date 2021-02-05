package srcAssignment1;

/**
 * This file is to be completed by you.
 *
 * @author s2101367
 */
public final class TextView
{
	public TextView()
	{
	
	}
	
	public final void displayNewGameMessage()
	{
		System.out.println("---- NEW GAME STARTED ----");
	}
	
	public final int askForMove()
	{
		System.out.print("Select a free column: ");
		return InputUtil.readIntFromUser();
	}
	
	public final void displayBoard(Model model)
	{
		int nrRows = model.getNrRows();
		int nrCols = model.getNrCols();
		// Get your board representation.
		char[][] board = new char[nrRows][nrCols];
			for( int row = 0; row < board.length; row++)  {
				for( int col = 0; col <board[0].length; col++){
					board[row][col] = ' ' ;
				}
			}




		// This can be used to print a line between each row.
		// You may need to vary the length to fit your representation.
		String rowDivider = "-".repeat(4 * nrCols + 1);
		String colDivider = "| . ".repeat(7);


		
		// A StringBuilder is used to assemble longer Strings more efficiently.
		StringBuilder sb = new StringBuilder();
		
		// You can add to the String using its append method.
		sb.append(rowDivider);
		sb.append("\n");
		sb.append(colDivider);
		sb.append("|");
	//	sb.append("\n");
	//sb.append(rowDivider);
		
		// Then print out the assembled String.
		System.out.println(sb);
		System.out.println(sb);
		System.out.println(sb);
		System.out.println(sb);
		System.out.println(sb);
		System.out.println(sb);
		System.out.println(rowDivider);
		System.out.println("  0   1   2   3   4   5   6  ");
	}
}
