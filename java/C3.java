import java.util.Scanner;
public class C3 {
    public static void printTable(int tab){
        for(int i = 1;i<=10;i++){
            System.out.println( tab + " x "+ i + " = " + i*tab);
        }
        return;
    }
    public static void calFactorial(int fact){
        int sum = 1;//if we intialize it we can use in sum = sum -i;
        for(int i = 1;i <= fact;i++){
            sum = sum  * i;
            
        }
        System.out.println("the factorial of " + fact + " is "+ sum);
        return;
    }
    public static void main(String[] args) {
        System.out.println("hello ! which tabel you have to print");
        Scanner sc = new Scanner(System.in);
        int tab = sc.nextInt();     //a static method cant access a non-static method
        printTable(tab);
        calFactorial(tab);
    }


}