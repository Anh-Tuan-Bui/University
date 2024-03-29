import java.util.ArrayList;

public class Game {
  private Board board;
  private ArrayList<Move> moveHistory = new ArrayList<Move>();

  /**Initialize Game. */
  Game(Board board) {
    this.board = board;
  }

  /**Getter board. */
  public Board getBoard() {
    return board;
  }

  /**Setter board. */
  public void setBoard(Board board) {
    this.board = board;
  }

  /**Getter move history. */
  public ArrayList<Move> getMoveHistory() {
    return moveHistory;
  }

  /**Move piece. */
  public void movePiece(Piece piece, int x, int y) {
    if (piece != null) {
      if (piece.canMove(board, x, y)) {
        if (board.getAt(x, y) == null) {
          Move move = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(), y, piece);
          moveHistory.add(move);
          piece.setCoordinatesX(x);
          piece.setCoordinatesY(y);
        } else {
          Move move = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(), y,
                                  piece, board.getAt(x, y));
          moveHistory.add(move);
          board.removeAt(x, y);
          piece.setCoordinatesX(x);
          piece.setCoordinatesY(y);
        }
      }
    }
  }
}