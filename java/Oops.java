 class Test{
    int marks;
    boolean grade;

    Test(int m){        //we cant set the non-static variabel for in static method or class
        this.marks = m;
    }
    public  void print_grade(){
        if(marks >= 14){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }
}
public class Oops{
    
    public static void main(String[] args) {
        
        Test t = new Test(39);
        t.print_grade();
    }
}