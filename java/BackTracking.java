import java.util.*;
public class BackTracking{
    static char [] [] chess = new char[4][4];
    public static void helper(ArrayList<ArrayList<String>> list,int col,List<List<Character>> board){
        for(int i = 0;i < 4;i++){
           if(issafe(list,board)){
            board[i][col] == 'Q';
            helper(list, col+1, board);
           }
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list1 = new ArrayList<>();
        List<List<Character>> board = new ArrayList<>();
        for(int i = 0;i < 4;i++){
            for(int j = 0;j < 4;j++){
                chess[i][j] = '.';
            }
        }
        helper(list1, idx);
    }
}