public class Player {
    public String name;
    public Symbol symbol;
    public MoveStrategy moveStratey;
    public Player(String name,Symbol symbol,MoveStrategy moveStrategy){
        this.name = name;
        this.symbol = symbol;
        this.moveStratey = moveStrategy;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Symbol getSymbol() {
        return symbol;
    }
    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
    public MoveStrategy getMoveStratey() {
        return moveStratey;
    }
    public void setMoveStratey(MoveStrategy moveStratey) {
        this.moveStratey = moveStratey;
    }
    public Move makeMove(Board board){
        return moveStratey.selectMove(board);
    }



}
