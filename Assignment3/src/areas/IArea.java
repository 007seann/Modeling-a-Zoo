package areas;

import java.util.ArrayList;

/**
 * This file must remain exactly as it is.
 */
public interface IArea
{
	/*
	Cage cage = new Cage();
	Aquarium aquarium = new Aquarium();
	Enclosure enclosure = new Enclosure();
	Entrance entrance = new Entrance();
	PicnicArea picnicarea = new PicnicArea();
	 */


	/**
	 * @return Returns the IDs of the areas adjacent to this one.
	 */
	public ArrayList<Integer> getAdjacentAreas();
}
