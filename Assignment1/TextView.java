package Assignment1;

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

		//Reverse order
		for(int i=nrRows - 1; i >= 0; i--) {
			for(int j=0; j <nrCols; j++) {
				char stone = model.getStone(i, j);
				System.out.print(stone + " ");
			}
			System.out.println();
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
		System.out.println("0 1 2 3 4 5 6");
	}
}
