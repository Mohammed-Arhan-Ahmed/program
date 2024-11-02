
//my question here is what is the main difference between loops and recursion?
public class Recursion {
    // public static void print_towerofhinao(int n,String src,String helper,String destination){
    //     if(n == 1){
    //         System.out.println("move the disk " + n + " from" + src +" to " + destination);
    //         return;
    //     }
    //     print_towerofhinao(n-1, src, destination, helper);//transforing n-1 (all disk except one big one to helper using destination as helper)
    
    //     System.out.println("move the disk" + n + "from" + src +" to " + destination);
    //     print_towerofhinao(n-1, helper, src, destination);

    // }
    // public static void reverseAString(int idx,String str){
    //    if(idx == 0){//i forget the basic thing , instead of keeping == i have kept = single one.
    //     System.out.print(str.charAt(idx));
    //     return;
    //    }
    //    System.out.print(str.charAt(idx));
    //    reverseAString(idx-1, str);
    //     }

    // static int first = -1;
    // static int last = -1;
    // public static void countofchar(int idx,String str,char a){

    //     if(idx == str.length()){
    //         System.out.println("the first occurance at " + first + " and last at " + last);
    //         return;
    //     }
    //     if(str.charAt(idx) == a){
    //         if(first == -1){
    //             first = idx;
    //         }
    //         else{
    //             last = idx;
    //         }
    //     }
    //     countofchar(idx+1, str, a);//you are writting the code right but you are doing the small mistakes such as 
    //     //writing single = instead of == ,using i++ ;
    // }
    // public static Boolean isSorted(int arr[],int idx){
    //     if(idx == arr.length-1){
    //         return true;
    //     }
    //     if(arr[idx] < arr[idx+1]){
    //         return  isSorted(arr, idx+1);
    //     }
    //     else{
    //         return false;
    //     }
    // }
    // static int count = 0;
    // public static void addX(int count,String s,char x){
    //     if(count == 0){
    //         System.out.println(s);
    //         return;
    //     }
    //     s+=x;
       
    //     addX(count-1, s, x);
    // }
    // public static void moveAllx(String str,int idx,char c,String s){
    //     if(idx == str.length()-1){

    //        addX(count, s, c);
    //         return;
    // }
    //     if(str.charAt(idx) == c){
           
    //         count+=1;
    //         moveAllx(str, idx+1, c, s);
    //     }else{                              //the main mistake i have done is i have forgetten to call the 
    //                                         //recursive function in both condition statement
           
    //         s+=str.charAt(idx);
    //         moveAllx(str, idx+1, c, s);
    //     }
    // }
    

    // //remove all duplicates
    //  public static boolean [] checkChar = new boolean[26];//the basics things which i have forgotten is 
    // //not keep [] brackets before checkChar
    // public static void removeDuplicates(String str,int idx,String newstr){
    //     if(idx == str.length()){
    //         System.out.println(newstr);
    //         return;
    //     }
    //     if(checkChar[str.charAt(idx) - 'a']){//we dont need to write ""== true" here it can be execute with out this
        
    //     removeDuplicates(str, idx+1, newstr);
    //     }else{
    //         newstr += str.charAt(idx);
    //         checkChar[str.charAt(idx) - 'a'] = true;
    //         removeDuplicates(str, idx+1, newstr);

    //     }
    // }

    //print all the subsequences(which means we have to print out all the sub parts of a string ,which goes
    //from left to right ex:the string is"arhan" the subsequences are "arhan","arha","arh","ar","a","rhan"
    //"rha","ha","h","han","an","n");//lets write code for it
    // public static void printAllSubsequence(String str,int idx,String combination){
    //     //if we want unique subsequeance add the sub in set .
    //     if(idx == str.length()){
    //         System.out.println(combination);
    //         return;
    //     }

    //     //every char in string has two case either it should come or not .so we have to called it for both
    //     char c = str.charAt(idx);
    //     //come case
    //     printAllSubsequence(str, idx+1, combination+c);
    //     // printAllSubsequence(str, idx+1, combination+=c);
    //     // this is a mistake that i have done here and 
    //     //mistkes is i have kept an "=" mark which thought me the importance of every letter which i have
    //     //written in this code .every letter has a great meaning
    //     //the mistake is first i have print the string the add,but i have to first add the print.

    //     //not come case
    //     printAllSubsequence(str, idx+1, combination);
    // }
    // public static void make_seprate(String str,int idx,String newstr,char c){
    //     if(idx <= 0){    //i want to use recursion instead of loop
    //         return;
    //     }                
    //     print_keycombo(str, idx,newstr+c);
    //     make_seprate(str, --idx, newstr,str.charAt(idx));
   // }
    public static String keypad [] = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz","9"};

    public static void print_keycombo(String str,int idx,String newstr){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char c = str.charAt(idx);
        int arrindex = c - '0';
        String keys = keypad[arrindex];


        for(int i = 0;i <keys.length() ;i++){
            print_keycombo(str, idx+1,newstr+keys.charAt(i));
        }
        print_keycombo(str, idx+1, newstr);
        
        

    }

    public static void main(String[] args) {
       //problem of tower of hinoai
       //here is a problem of hinaoi tower in which we have to move disk from src to destination using 
       //helper .there will be 3 towers one is src,helper,destination.

      // print_towerofhinao(4, " S "," H ", " D ");
      String str = "aabbccccd";
      //reverseAString(str.length()-1, str);
     // countofchar(0, str, 'a');
    //   int arr [] = {5,6,7,8,1};
    //   boolean ans = isSorted(arr, 0);
    //   if(ans){
    //     System.out.println("array is strictly sorted");
    //   }
    //   else{
    //     System.out.println("array is not sorted");
    //   }
   // moveAllx("axbcdxxe", 0, 'x', "");
   // removeDuplicates(str, 0, "");
   String a = "arhan";
   String s = "abc";
   char c = 'c';
    //printAllSubsequence(a, 0, "");
  
//   System.out.println(s+c);//it will add then print string
//   System.out.println(s+=c);//first it will print the string then it will add
 // System.out.println(s+='h');
  //System.out.println(s+'h');
  //print_keycombo("2", 0, ""); see yours output and shardhas output and code.

    }
}