package srcAssignment1;

/**
 * This file is to be completed by you.
 *
 * @author s2101367
 */
public final class Model
{
	// ===========================================================================
	// ================================ CONSTANTS ================================
	// ===========================================================================
	// The most common version of Connect Four has 6 rows and 7 columns.
	public static final int DEFAULT_NR_ROWS = 6;
	public static final int DEFAULT_NR_COLS = 7;
	boolean turn;




	// ========================================================================
	// ================================ FIELDS ================================
	// ========================================================================
	// The size of the board.
	private int nrRows; // start from 0
	private int nrCols; // start from 0
	private char[][] board;
	private boolean player;




	// =============================================================================
	// ================================ CONSTRUCTOR ================================
	// =============================================================================
	public Model()
	{
		// Initialise the board size to its default values.
		nrRows = DEFAULT_NR_ROWS;
		nrCols = DEFAULT_NR_COLS;
		// Initialise board with special character "."
		for (int i=0; i < nrRows; i ++) {
			for (int j=0; j < nrCols; j ++) {
				assert board != null;
				board[i][j] = '.';
			}
		}
		this.board = board;
		this.player = true;

	}

	public char getStone(int row, int col)
	{
		return board[row][col]; // @@ 여기서 row랑 col의 값은 어디서 가져오는거? 어떻게 정해지는거? row,col는 parameter or variable인데. 일단 getStone은 method.
	}

	// ====================================================================================
	// ================================ MODEL INTERACTIONS ================================
	// ====================================================================================

	// If col is valid, return 'true' ( or row)
	// If col in invalid, return 'false' ( or row)
	public boolean isMoveValid(int col)
	{
		if( col < 0 || col >= nrCols) {
			return false;
		}


		// What happend to row? Should I check against of not?// I should check
		boolean isValid = false;
		for (int i=0; i < nrRows; i++) {
			if(board[i][col] == '.') {
				isValid = true;
				break;
			}
		}


		return isValid;
	}


	public void makeMove(int col)
	{
		if(!this.isMoveValid(col)) {
			System.out.println("Oops!!!It's wrong. please try another one");
			// if the chosen one is not valid, need to build a code to make user to choose another available one.
			return;
		}

		// Find the next empty row index for the column.
		int row = 0;
		for ( int i=0; i<nrRows; i++) {
			if(board[i][col] == '.') {
				row = i;
				break;
			}
		}

		// Find the color of stone per player.
		char stone;
		if (this.player)
			stone = 'O';
		else
			stone = 'X';

		// Insert the stone to row,col
		this.board[row][col] = stone;

	}

	public boolean checkWin(int row, int col, char playerStone) {
		// downward
		int count=0;
		for (int i = row; i < nrRows; i++) {
			if(board[i][col] == playerStone) {
				count++;
				if (count == 4) {
					return true;
				}
			} else {
				break;
			}

		}
		// right
		count = 0;
		for (int i = col; i < nrCols; i++) {
			if(board[row][i] == '.') {
				break;
			}
			if(board[row][i] == playerStone ) {
				count++;
				if(count==4) {
					return true;
				}
			} else {
				break;
			}
		}

		// left
		count = 0;
		for (int i = col; i >= 0; i--) {
			if(board[row][i] == '.') {
				break;
			}
			if(board[row][i] == playerStone) {
				count++;
				if(count==4) {
					return true;
				}
			}  else {
				break;
			}
		}

		//down right
		count = 0;
		for (int i = row, j = col; i < nrRows && j < nrCols; i++,j++) {
			if(board[i][j] == '.') {
				break;
			}
			if(board[i][j] == playerStone) {
				count++;
				if(count==4) {
					return true;
				}
			} else {
				break;
			}
		}

		//down left
		count =0;
		for (int i = row, j = col; i >=0 && j >= 0; i--,j-- ) {
			if(board[i][j] == '.') {
				break;
			}
			if(board[i][j] == playerStone) {
				count++;
				if(count==4) {
					return true;
				}
			} else {
				break;
			}

		}

		//up right
		count =0;
		for (int i = row, j = col; i >= 0 && j < nrCols; i--,j++) {
			if(board[i][j] == '.') {
				break;
			}
			if(board[i][j] == playerStone) {
				count++;
				if(count==4) {
					return true;
				}
			} else {
				break;
			}
		}

		//up left
		count =0;
		for (int i = row, j = col; i < nrRows && j >=0; i++,j--) {
			if(board[i][j] == '.') {
				break;
			}
			if(board[i][j] == playerStone) {
				count++;
				if(count==4) {
					return true;
				}
			} else {
				break;
			}
		}
		return false;
	}


	public void setPlayer(boolean p)
	{
		this.player = p;
	}

	// =========================================================================
	// ================================ GETTERS ================================
	// =========================================================================
	public int getNrRows()
	{
		return nrRows;
	}

	public int getNrCols()
	{
		return nrCols;
	}
}

