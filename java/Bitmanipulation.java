import java.util.Scanner;
public class Bitmanipulation {
    public static void main(String[] args) {
        //there are 4 methods in bit manipulation
        //1.get-getting the bit of a particular positon 
        //2.set - set the bit at a position if 0 is there it will set it as 1 ,if 1 is there it wil be one 1.
        //3.clear - it will make 1 to 0 and 0 to 0
        //4.update - it will update 1 as 0 and 0 as 1.

        //perform get operation  {understand the logic ,dont memorize it}
    //     int n = 5;//which is 0101
    //     int pos = 2;//start from right to left
    //     int bitmask = 1<<pos;
        
    //     if((bitmask & n) == 0){
    //         System.out.println("the number is zero");
    //     }
    //     else{
    //         System.out.println("the number is one");
    //     }

    // set operation 
    // int n = 5;//0101
    // int pos = 1;
    // int bitmask = 1<<pos;
    
    // int ans = n | bitmask;
    // System.out.println(ans);// 0101 is set as 0111 which is 7 in decimal

    // clear operation
    // int n = 5;//0101
    // int pos = 2;
    // int bitmask = ~(1<<pos);
    // int ans = bitmask & n;
    // System.out.println(ans);//ans is 1 because the 0101 will be change as 0001 which 1 in decimal

    //update -- make 0 to 1 and 1 to 0
    int n = 5;//0101
    Scanner sc = new Scanner(System.in);
    System.err.println("enter the positon you want to change ");
    int pos = sc.nextInt();
    
    int bitmask = 1<<pos;
    int know = bitmask & n;
    if(know == 0){
        int ans = n | bitmask;
        System.out.println(ans);
    }
    else{
        int not = ~(bitmask);
        int ans = not & n;
        System.out.println(ans);
    }
    //if we enter the postion 2 it will print the output as 1 
    // and if we enter the postion 1 it will print the output as 7

    }
}
