public class Board {
    int n;
    Symbol[][]board;
    public Board(int n){
        this.n = n;
        this.board = new Symbol[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]= Symbol.EMPTY;
            }
        }
    }
    public boolean isValid(int r,int c){
        if(r>=n || r<0 || c>=n || c<0)return false;
        return board[r][c]==Symbol.EMPTY;
    }
    public void placeMove(int r,int c,Symbol symbol){
        board[r][c]= symbol;
    }
    public void undoMove(int r, int c){
        board[r][c]=Symbol.EMPTY;
    }
    public void print(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==Symbol.EMPTY)
                 System.out.print(". ");
                else System.out.print(board[i][j]+" ");
            }
            System.out.println();

        }
    }
    public boolean draw(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==Symbol.EMPTY)return false;
            }
        }
        return true;
    }
    public boolean win(Symbol symbol){
        //row wise
        return rowWise(symbol) || colWise(symbol) || mainDiag(symbol)||antiDiag(symbol);
       
    }
    public boolean rowWise(Symbol symbol){
        boolean isSame;
        for(int i=0;i<n;i++){
            isSame=true;
            for(int j=0;j<n;j++){
                if(board[i][j]!= symbol){
                    isSame=false;
                    break;
                }
            }
            if(isSame)return true;
        }
        return false;
    }
    public boolean colWise(Symbol symbol){
        boolean isSame;
        for(int i=0;i<n;i++){
            isSame=true;
            for(int j=0;j<n;j++){
                if(board[j][i]!=symbol){
                    isSame=false;
                    break;
                }
            }
            if(isSame)return true;
        }
        return false;
    }
    public boolean mainDiag(Symbol symbol){
        boolean isSame=true;
        for(int i=0;i<n;i++){
            if(board[i][i]!=symbol){
                isSame=false;
                break;
            }
        }
        return isSame;
        
    }
    public boolean antiDiag(Symbol symbol){
        boolean isSame=true;
        for(int i=0;i<n;i++){
            if(board[i][n-1-i]!=symbol){
                isSame=false;
                break;
            }
        }
        return isSame;
    }
    public int getN() {
        return n;
    }
    public Symbol[][] getBoard() {
        return board;
    }

}
