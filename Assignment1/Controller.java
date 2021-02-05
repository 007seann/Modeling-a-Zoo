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

	public Controller(Model objectModel, TextView objectView)
	{
		this.model = objectModel;
		this.view = objectView;
	}

	public void startSession()
	{

		this.view.displayBoard(this.model);
		this.view.displayNewGameMessage();

		boolean player = true; // player 1 -> true, player 2 -> false
		boolean checkWin = false;
		do {

			if (player)
				player = false;
			else
				player = true;

			this.model.setPlayer(player); // after knowing player turn, a certain stone need to be assigned. 왜 setPlayer가 있어야 하는거지? player 1인지 player2인지 확인해주는건가?

			int col = InputUtil.readIntFromUser();

			this.model.makeMove(col);

			this.view.displayBoard(this.model);

			//Detect whether game is over or not. Did Player 1 win?
			//boolean checkWin = model.checkWin(); win ->return true, not win(= continue) ->return false
			//boolean checkWin = false;

		} while(!checkWin);
		//while(!model.checkWin(int row, col, char playerStone)); // 왜안될까요~~~~. row,col,playerStone이 localvariable인데 이 method안에 정의가 안되있어서인가? 그러면 어떻게하지?


		System.out.println("Player" + player + " Win.  Congrat!!!");

	}
}
