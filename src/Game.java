//Grant Wilson
//28 May 2016

public interface Game{
	//responsible for being a referee for the game Reversi
	public boolean IsGameOver(Board board);
//	check if there are any available moves for the current board
	public void ChangeTurn(Player player);
//	will change the current turn to the next players turn
	public Player Winner(Player playerOne, Player playerTwo);
//	will compare players scores and return the winner
}