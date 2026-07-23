public class Main {
    public static void main(String[] args) {
        int n = 3;
        Player p1  = new Player("Sumanth",Symbol.O,new HumanMoveStrategy());
        Player p2 = new Player("Computer",Symbol.X,new SmartComputerStrategy(Symbol.X));
        Game game = new Game(n, p1, p2);
        game.play();
    }
}
