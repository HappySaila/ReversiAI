//Grant Wilson
//28 May 2016

public class ReversiPosition{
	int row;
	int column;
	int color;
	public ReversiPosition(int row, int column, int color){
		this.row = row;
		this.column = column;
		this.color = color;
	}
	public boolean IsLegal(Board board){
		return true;
	}
}