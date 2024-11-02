import java.util.Scanner;
public class Twodarray {//a class name cant be start with numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows :");
        int n = sc.nextInt();
        System.out.print("enter th number of colums : ");
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for(int i = 0;i < n ; i++){
            for(int j = 0;j< m;j++)
            {   System.out.println("enter the element " + i +"" + j);
                
                arr[i][j] = sc.nextInt();
            }
        
            
        }
        for(int i = 0;i < n ; i++){
            for(int j = 0;j< m;j++)
            {
               System.out.print(arr[i][j]+ " ");
           
            }
        System.out.println();
            
        }
        System.out.println(arr.length);
        System.out.println("the spiral oder matrix is");
        int rowst = 0;
        int rlast = n-1;
        int clast = m- 1;
        int colst = 0;
        while(rowst <= rlast && colst <= clast){
            for(int j = colst;j <= clast;j++){
                System.out.print(arr[rowst][j] + " ");
            }
            rowst++;
            for(int i = rowst;i <= rlast;i++){
                System.out.print(arr[i][clast] + " ");
            }
            clast--;
            for(int i = clast;i >= colst;i--){
                System.out.print(arr[rlast][i] + " ");
            }
            rlast--;
            for(int j = rlast;j >= rowst;j--){
                System.out.print(arr[j][colst]+" ");
            }
            colst++;
            System.out.println();//by printing the next line it solve the problem of last element print double.
        }
        
    }
}
