public class RandomComputerStrategy implements MoveStrategy {
     public Move selectMove(Board board) {
        for (int r = 0; r < board.getN(); r++) {
            for (int c = 0; c < board.getN(); c++) {
                if (board.isValid(r, c)) {     
                    System.out.println("Computer plays: " + r + " " + c);
                    return new Move(r, c);
                }
            }
        }
        return null;
    }
}
