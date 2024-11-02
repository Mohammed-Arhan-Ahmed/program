import java.util.Scanner;
public class E1 {
   /*  static int printAvg(float arr[]){
        int avg = 0;
        for(int i = 0; i < (arr.length);i++){ //how to type cast in java
            avg += arr[i];
        }
        return avg/arr.length;
*/
    public static void main(String[] args) {
        //fuction to print avg
        Scanner sc = new Scanner(System.in);
       /*  System.out.println("how many semester do you have ?");
        int sems = sc.nextInt();
        float arr [] = new float[sems];
        for(int i = 0;i < arr.length; i++){
            System.out.println("enter the marks of sem" + i+1);
            arr[i] = sc.nextFloat();
        }
       float average =  printAvg(arr);
       System.out.println("the average marks of you sems are:" + average);

       //question -2
       System.out.println("enter the n(size) value :");
       int n = sc.nextInt();
       System.out.println("the odd numbers upto " + n + "are :");
       int sum = 0;
       for(int i = 1;i <= n;i++){
            if(i%2 != 0){
                System.out.println(i);
                sum += i;
            }
       }
       System.out.println("the sum of odd numbers are : " + sum); 8
       
      //question -3
      System.out.println("enter the first number :");
      int a = sc.nextInt();
      System.out.println("enter the second number :");
      int b = sc.nextInt();
      if(a > b){
        System.out.println("a is greater");
      }
      else if( a == b){
        System.out.println("a is equals to b");
      }
      else{
        System.out.println("a is less than b");
      }
      //question - 3
      int pos = 0;
      int zero = 0;
      int neg = 0;
      while(true){
        System.out.println("enter q to quit,else any key :");
        String check = sc.next();
        if(check.equalsIgnoreCase("q")){
           
             break;
            
        }
        System.out.println("enter the number :");
        int num = sc.nextInt();
        if(num < 0){
            neg++;
        }
        else if(num > 0){
            pos++;
        }
        else{
            zero++;
        }
      }
      System.out.println("the positive numbers are :" + pos);
      System.out.println("the negetive numbers are :" + neg);
      System.out.println("the zeros are :" + zero);
      //question x^n
      System.out.println("for x^n enter x value");
      int x = sc.nextInt();//2
      System.out.println("for x^n enter n value");
      int n = sc.nextInt();//2
      int total = 1;
      for(int i = 0;i <= n;i++){
        total = total * x;//if we are getting an error to over come that erroe we have to analayze on every
        //step that what is going on by syso();
       
        if(i == 0){
            total--;
        }
        
        
      }
      System.out.println("the x^n = :" + total);
      
      System.out.println("upto where u have to print fibbonachi");
      int n = sc.nextInt();
      int j = 0;
      int k = 1;
      System.out.print(j + " ");
      System.out.print(k + " ");
      for(int i = 0;i <= n;i++){
        int s = j + k;
        System.out.print(s + " ");
        j = k; //always you have to take / not \ [k to k relation]
        k = s;

      }
*/
      
    }
}
