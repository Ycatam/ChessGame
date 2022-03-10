package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {

		this.board = board;
		position = null;
	}

	// accessible only by the board class and the sub-classes.
	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {

		// hook methods, a concrete method using a abstract method
		return possibleMoves()[position.getRow()][position.getColumn()];

	}

	public boolean isThereAnyPossibleMove() {

		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {

				if (mat[i][j]) {
					return true;
				}

			}
		}

		return false;

	}

}
