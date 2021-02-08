package Assignment1;

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

		nrRows = DEFAULT_NR_ROWS;
		nrCols = DEFAULT_NR_COLS;
		board = new char[nrRows][nrCols];
		for (int i=0; i < nrRows; i ++) {
			for (int j=0; j < nrCols; j ++) {
				//assert board != null; // 일단 삼촌이 처음에 짜준거를 바탕(boolean checkWin = false)으로 실행해보면 NullPointerException이 나와서 변경했으나 해결되지 않음.
				board[i][j] = '.'; // 여기서 왜 NullPointerException이 나오는거? nrRows * nrCols 크기의 보드에 '.'를 assign해준거면 null이 안나오지 않나??
			}
		}

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



		boolean isValid = false;
		for (int i=0; i < nrRows; i++) {
			if(board[i][col] == '.') {
				isValid = true;
				break;
			}
		}


		return isValid;
	}


	public int makeMove(int col)
	{
		if(!this.isMoveValid(col)) {
			System.out.println("Oops!!!It's wrong. please try another one");
			// if the chosen one is not valid, need to build a code to make user to choose another available one.

		}

		int row = 0;
		for ( int i=0; i<nrRows; i++) {
			if(board[i][col] == '.') {
				row = i;
				break;
			}
		}


		char stone;
		if (this.player)
			stone = 'O';
		else
			stone = 'X';


		this.board[row][col] = stone;
		return row;

	}

	// check horizontal line if it is contiguous starting from row,col.
	// For the given stone at (row, col), return the length of horizontal line that is formed with the same stone (at the same row).

	private int getHorizontalLength(int row, int col) {
		// Get the currrent stone
		char playerStone = board[row][col];

		// Corner case. Bail out if it's empty
		if (playerStone == '.')
			return 0;

		// Initialize the count = 1 (the current stone itself)
		int count = 1;

		// Search right
		for (int j = col + 1; j < nrCols; j++) {
			if (board[row][j] != playerStone)
				return count;
			count++;
		}

		// Search left
		for (int j = col - 1; j >= 0; j--) {
			if (board[row][j] != playerStone)
				return count;
			count++;
		}

		return count;
	}
	// check vertical line if it is contiguous starting from row,col.
    private int getVerticalLength(int row, int col) {
	// Get the current stone
	char playerStone = board[row][col];

	// Corner case. Bail out if it's empty
	if (playerStone == '.')
		return 0;

	// Initialize the count = 1 (the current stone itself)
	int count = 1;

	//Search up
	for (int i = row - 1; i >= 0; i--) {
		if (board[i][col] != playerStone)
			return count;
		count++;
	}

	//Search down
	for (int i = row + 1; i < nrRows; i++)	{
		if (board[i][col] != playerStone)
			return count;
		count++;
	}
	return count;

	}


	// check top-right to bottom-left diagonal line if it is contiguous starting from row,col
	private int getDiagonalSlashLength(int row, int col) {
	// Get the current stone
	char playerStone = board[row][col];

	// Corner case. Bail out if it's empty
	if (board[row][col] == '.')
		return 0;

	// Initialize the current stone itself
	int count = 1;

	//Search top-right
	for (int i = row, j = col; i >= 0 && j < nrCols; i--,j++) {
		if (board[i][j] != playerStone)
			return count;
		count++;
	}

	//Search down-left
	for (int i = row, j = col; i < nrRows && j < nrCols; i++,j++) {
		if (board[i][j] != playerStone)
			return count;
		count++;
	}
	return count;

	}

	// check top-left to bottom-right diagonal line if it is contiguous starting from row,col
	private int getDiagonalBackslashLength(int row, int col) {
	// Get the current state
	char playerStone = board[row][col];

	// Corner case. Bail out if it's empty
	if (board[row][col] == '.')
		return 0;

	// Initialize the current stone itself
	int count = 1;

	// Search top-left
	for (int i = row, j = col; i < nrRows && j >=0; i++,j--) {
		if(board[i][j] != playerStone)
			return count;
		count++;
	}

	// Search bottom-right
	for (int i = row, j = col; i < nrRows && j < nrCols; i++,j++) {
		if(board[i][j] != playerStone)
			return count;
		count++;
	}
	return count;
}

	public boolean checkWin(int row, int col) {


		if (getHorizontalLength(row, col) == 4)
			return true;
		else if (getVerticalLength(row, col) == 4)
			return true;
		else if (getDiagonalSlashLength(row, col) == 4)
			return true;
		else if (getDiagonalBackslashLength(row, col) == 4)
			return true;
		else return false;
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


