import java.util.Scanner;

public class Game {
    public Board board;
    public Player[]players;
    int currentPlayerInd;
    public Game(int n,Player p1,Player p2){
        this.board = new Board(n);
        this.players = new Player[]{p1,p2};
        this.currentPlayerInd=0;
    }
    public void play(){
        Scanner sc = new Scanner(System.in);
        while(true){
            board.print();
            Player current = players[currentPlayerInd];
            System.out.println(current.getName() + "'s turn (" + current.getSymbol() + ")");
            Move move = current.makeMove(board);
            int r = move.getRow();
            int c = move.getCol();
            if(!board.isValid(r,c)){
                System.out.println("Invalid move try again!");
                continue;
            }
            board.placeMove(r,c,current.getSymbol());
            boolean win = board.win(current.getSymbol());
            if(win){
                 System.out.println(current.getName() + " wins!");
                break;
            }
            if(board.draw()){
                 System.out.println( " Draw!");
                break;
            }
            currentPlayerInd = 1-currentPlayerInd;
        }
    }

}
