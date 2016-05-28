//Grant Wilson
//28 May 2016

public class ReversiPlayer implements Player{
	int color; //1=white 2=black
	public ReversiPlayer(int color){
		this.color = color;
	}
	public Board Move(Board board, Position position){
		return new ReversiBoard(6);
	}
}