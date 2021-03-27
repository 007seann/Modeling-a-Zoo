package areas;

import java.util.ArrayList;

/**
 * This file must remain exactly as it is.
 */
public interface IArea
{
	int getId();
	void setId(long lastID);
	String getName();
	/**
	 * @return Returns the IDs of the areas adjacent to this one.
	 */
	public ArrayList<Integer> getAdjacentAreas();
}
