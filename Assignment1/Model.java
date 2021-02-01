/**
 * This file is to be completed by you.
 *
 * @author <Please enter your matriculation number, not your name>
 */
public final class Model
{
	// ===========================================================================
	// ================================ CONSTANTS ================================
	// ===========================================================================
	// The most common version of Connect Four has 7 rows and 6 columns.
	public static final int DEFAULT_NR_ROWS = 7;
	public static final int DEFAULT_NR_COLS = 6;
	
	// ========================================================================
	// ================================ FIELDS ================================
	// ========================================================================
	// The size of the board.
	private int nrRows;
	private int nrCols;
	
	// =============================================================================
	// ================================ CONSTRUCTOR ================================
	// =============================================================================
	public Model()
	{
		// Initialise the board size to its default values.
		nrRows = DEFAULT_NR_ROWS;
		nrCols = DEFAULT_NR_COLS;
	}
	
	// ====================================================================================
	// ================================ MODEL INTERACTIONS ================================
	// ====================================================================================
	public boolean isMoveValid(int move)
	{
		return false; // TODO
	}
	
	public void makeMove(int move)
	{
		// TODO
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
