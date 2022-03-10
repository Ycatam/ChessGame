package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		
		this.board = board;
		position = null;
	}

	//accessible only by the board class and the sub-classes.
	protected Board getBoard() {
		return board;
	}

		

}
