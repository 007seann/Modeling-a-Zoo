package animals;

import areas.IArea;

/**
 * You can modify the contents of this class, but you cannot:
 * - change the name, parameters or return types of provided methods
 * - remove it entirely
 */
public abstract class Animal
{
	/*
	protected static Buzzards buzzards;
	protected static Parrots parrots;
	protected static Gazelles gazelles;
	protected static Lion lion;
	protected static Zebra zebra;
	protected static Starfish starfish;
	protected static Sharks sharks;
	protected static Seals seals;


	 */
	/**
	 * @return Returns this animal's given name.
	 */
	public abstract String getNickname();
	
	/**
	 * Check whether two animals can live together.
	 * @param animal The animal for which to check compatibility with this animal.
	 * @return Returns true for compatible animals and false otherwise.
	 */
	public abstract boolean isCompatibleWith(Animal animal);


	public abstract boolean canLiveIn(IArea area);


}
