import java.util.Scanner;
public class C2 {
    public static void main(String[] args) {
      /*   System.out.println('2' * 3);
      for(int i = 5;i>= 0;i--){
        for (int j = i;j>= 0;j--){
        char s = '*';
       System.out.print(s);
    }System.out.println();
      }
     // System.out.println(5 * 10 / 10 - 5);java wont follow BODMAS rule. ans = 0
        System.out.println("enter the a ,b value:");
        Scanner sc = new Scanner (System.in);
        int b = sc.nextInt();sc.nextLine();
        int a = sc.nextInt();
        int c = b+a;
        System.out.println("the addition of a+b is:" + c);
        
        for(int i = 0;i<= 5;i++){

            for(int k = 5 ;k>=i;k--){
                System.out.print(" ");
            }
            for (int j = 0;j<= i;j++){
            
            char s = '*';
           System.out.print(s);
        }System.out.println();
          }
          for(int i = 5;i>= 0;i--){
            for (int j = i;j>= 0;j--){
            char s = '*';
           System.out.print(s);
        }System.out.println();
          } 
         for (int i = 1;i<=4;i++){
          for(int j = 1;j<=5;j++){
            if(i == 1 || j == 1 || i == 4 || j == 5){
              System.out.print("*");
            }
            else{
              System.out.print(" ");
            }
          } System.out.println();

         }
        //butter fly pattern
        for(int i = 0;i<=4;i++){
          for(int j = 0;j<=i;j++){
            System.out.print("*");
          }   
          //diff between k-=2 & k=-2?
          int space = 2*(4 -i );

          for(int k = 1;k <= space;k++){
            System.out.print(" ");
            
          }
          for(int l = 0;l <= i;l++){
            System.out.print("*");
          }
          System.out.println();
        }
        for(int i = 4;i>=0;i--){
          for(int j = 0;j<=i;j++){
            System.out.print("*");
          }   
          //diff between k-=2 & k=-2?
          int space = 2*(4 -i );

          for(int k = 1;k <= space;k++){
            System.out.print(" ");
            
          }
          for(int l = 0;l <= i;l++){
            System.out.print("*");
          }
          System.out.println();
        }
        //cross rectangle
        for (int i = 0;i  <= 5;i++){
          int s = 5 - i;
          for(int j = 0;j<=s ;j++){
            System.out.print(" ");
          } 
          for(int k = 4;k>=0;k--){
            System.out.print("*");
          }
          System.out.println("");
        }*/
       //palindrome number pramid
       for(int i = 1;i <= 5;i++){
        int space = 5 - i;
        for(int j = 1;j<= space;j++ ){
          System.out.print(" ");
        }
        for(int k = i;k <= 1;k++){
          System.out.print(k);
        }
        for(int g = 2;g <= i;g++){
          System.out.print(g);
        }
        System.out.println();
       }
    }
}
