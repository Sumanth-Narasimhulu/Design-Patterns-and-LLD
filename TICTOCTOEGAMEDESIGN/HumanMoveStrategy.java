import java.util.Scanner;
public class HumanMoveStrategy implements MoveStrategy {
    private Scanner scanner = new Scanner(System.in);
        public Move selectMove(Board board) {
            System.out.print("Enter row and col: ");
            return new Move(scanner.nextInt(), scanner.nextInt());
        
}
}