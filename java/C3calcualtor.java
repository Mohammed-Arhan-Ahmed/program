import java.util.Scanner;
public class C3calcualtor {
    public static void main(String[] args) {
        while(true){
        System.out.println("calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first num : ");
        float a = sc.nextFloat();
        System.out.println("enter the operator : ");
        String op = sc.next();
        System.out.println("enter the second: ");
        float b = sc.nextFloat();
        float ans;
        switch(op){
            case "+":
              ans = a+b;
              System.out.println("the sum is :" + ans);
              break;
            case "-":
              ans = a-b;
              System.out.println("the sub is : " + ans);
              break;
            case "*" :
              ans = a*b;
              System.out.println("the mul is : " + ans);
              break;
            case "/" :
              ans = a/b;
              System.out.println("the div is : " + ans);
              break;
        
            default:
            System.out.println("please enter valid operator");
               
        }
     
    System.out.println("if you want to exit press q else any key :");
    String q = sc.next();
    if(q.equalsIgnoreCase("q")){
        break;
    }
}
  }

}
