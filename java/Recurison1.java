import java.util.Scanner;
public class Recurison1 {
    // public static void print_table(int n,int i){
    //     if(i > 10){
    //         return;
    //     }
    //     System.out.println(n + " x " + i +" = " + n*i);
    //     print_table(n, i+1);//we cant write i++ here it wont work.
    // }
    // public static void print_sum_of_n(int sum,int n,int base){
    //     if(n > base){
    //         System.out.println("the sum is :" + sum);
    //         return;
    //     }
    //     print_sum_of_n(sum+=n, n+1, base);
    
        
    // }
//     public static int print_fict(int n){//1 1 5
//         if(n == 1 || n == 0 ){
//             return 1;        //the one disadvantage of going in ascending order is we have to keep a
//                                 //an extra parameter to check tha base case

//                                 //the main advantage of going in desending order is we dont have to declare
//                                 //an extra parameter and we can easile keep base case as if(x == 0) return;
//                                 //like this we dont need to worry.
//         }
//     //     System.out.println(fact);
//     //     fact = fact * n;             //to identify the mistakes i have kept this code
//     //   int store =   print_fict(fact, n+1, base);//here the code i have written is right in the return type 
//     //of a function is void not for int.
//     //     return fact;
//     int fact_n_minus_1 = print_fict(n-1);
//     int fact = n * fact_n_minus_1;
//     return fact; 
// }
    // public static void print_fibbonachi(int a,int b,int n){
    //     //as we are going in desending order we dont need an extra parameter for track
    //     if(n == 0){
    //         return;
    //     }
    //    // System.out.println(a); //we dont require a because we are not updating a value
    //     System.out.println(b);
    //     int c = a+b;
    //     print_fibbonachi(b, c, n-1);
    // }
    public static int powerToN(int x,int n){
        if(n == 0){
            return 1; //here 1 is because x^n where n = 0 equals to 1;
        }
        if(x == 0){
            return 0;//here 0 because 0 to power anything is 0;
        }
        // int minus1 = powerToN(x, n-1);//desending order
        // return x * minus1;                   //the time complexity of this 2 lines is O(n)
        //now here is a another way to do the same thing with O(log n )
        if(n % 2 == 0){
            return powerToN(x, n/2) * powerToN(x, n/2);
        }
        else{
            return powerToN(x, n/2) * powerToN(x, n/2) * x;
        }
    }
    

    public static void main(String[] args) {
        //a function which called it self is called recursion
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x and n in x^n form ");

       int x = sc.nextInt();
       int n = sc.nextInt();
       int ans = powerToN(x, n);
       System.out.println("the power of "+ x + "^"+n +" is :"+ ans);
       // print_table(table, 1);
    //    print_sum_of_n(0, 1, table);
      // int fict =  print_fict(table);
      // System.err.println("the fictorial is " + fict);
      //System.out.println("0");
      //System.out.println("1");
     // print_fibbonachi(1, 1, table-2);

    }
     
}