package srcAssignment1;

/**
 * This file is to be completed by you.
 *
 * @author s2101367
 */
public final class Controller
{
	private final Model model;
	private final TextView view;
	
	public Controller(Model model, TextView view)
	{
		this.model = model;
		this.view = view;
	}
	
	public void startSession()
	{
		// TODO Complete this method. The following bits of code should be useful:

		view.displayBoard(model);
		
		model.makeMove(1);
		
		// Tell the user that the game has started.
		view.displayNewGameMessage();
		
		// Repeat...
	}
}
