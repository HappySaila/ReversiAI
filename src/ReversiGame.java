//Grant Wilson
//28 May 2016
import java.util.Scanner;
public class ReversiGame implements Game{
//	Initialise
	Player first;
	Player second;
	Board board;
	public ReversiGame(int n){
		this.board = new ReversiBoard(n);
		this.first = new ReversiPlayer(1);
		this.second = new ReversiPlayer(2);
	}
	public boolean IsGameOver(Board board){
		return true;
	}
	public void ChangeTurn(Player player){
		
	}
	public Player Winner(Player playerOne, Player playerTwo){
		return new ReversiPlayer(1);
	}
	public static void main(String[] args) {
		System.out.println("\nReversi\n");
		System.out.print("Enter Table Size: ");
		Scanner sc = new Scanner(System.in);
		ReversiGame game = new ReversiGame(sc.nextInt());
		game.board.PrintBoard();
		
	}
}