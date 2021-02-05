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

		nrRows = DEFAULT_NR_ROWS;
		nrCols = DEFAULT_NR_COLS;

		for (int i=0; i < nrRows; i ++) {
			for (int j=0; j < nrCols; j ++) {
				assert board != null; // 일단 삼촌이 처음에 짜준거를 바탕(boolean checkWin = false)으로 실행해보면 NullPointerException이 나와서 변경했으나 해결되지 않음.
				board[i][j] = '.'; // 여기서 왜 NullPointerException이 나오는거? nrRows * nrCols 크기의 보드에 '.'를 assign해준거면 null이 안나오지 않나??
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

	}

	public boolean checkWin(int row, int col, char playerStone) {
		// downward
		int count=0;
		for (int i = row; i < nrRows; i++) {
			if(board[i][col] == playerStone) { // 로직 맞는지 확인좀. if statement를 이렇게 쓴 이유는 board[i][col]위치에
				                               // 있는 stone( X or O )이 user가 새로 넣은 stone(playerStone)과 동일한 경우를 체크하려고 한거
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

