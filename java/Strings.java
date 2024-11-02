import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        // String name = "md arhan";
        // //to concatenate
        // System.out.println(name + " is a " + " good boy");
        // //length()
        // System.out.println(name.length());
        // //substring
        // System.out.println(name.substring(0, name.length()));//to print full name you dont have to do -1;
        Scanner sc = new Scanner(System.in);
        // String value = sc.nextLine();
        // //compare strings
        // if(name.equals(value)){
        //     System.out.println("Assalamalikum " + name);
        // }
        // else{
        //     System.err.println("sorry,you cant");
        // }
        // //take some strings from user and print the combined length of all
        // System.out.println("enter how many names you have to enter");
        // int n = sc.nextInt();
        // String arr [] = new String [n];
        // for(int i = 0; i < n;i++){
        //    // System.out.println("enter the name of index " + i);
        //     arr[i] = sc.nextLine();
        // }//why it is printing one less than what we enter
        // //total length
        // int total = 0;
        // for(int i = 0; i < n;i++){
        //     total += arr[i].length();
        // }
        // System.out.println("the total cumulative length of given strings are :" + total);
       //printing the result of a string by replace the word with sutiable one
        // System.out.println("enter the string ");
        // String name = sc.nextLine();
        // System.out.println("enter the char you want to replace with wohom(char,replace)");
        // String ch = sc.next();
        // String c = sc.next();
        // for(int i = 0;i < name.length();i++){
        //     if(Character.toString(name.charAt(i)).equals(c)){
                
        //         String r = name.replace(ch, c);
        //         System.out.println(r);
        //     }
        // }

        // StringBuilder sb = new StringBuilder("arhan");
        // System.out.println(sb);
        // //char at
        // System.out.println(sb.charAt(0));
        // //set char at
        // sb.insert(0, 'f');//what we have to do to  a set characters at
        // System.out.println(sb);
        // //delete
        // sb.delete(0,1);
        // System.out.println(sb);
        // //insert
        // sb.insert(0,"mohammed ");
        // System.out.println(sb);//insert will add element at first and append will add at last
        // //append
        // sb.append(" ahmed");
        // System.out.println(sb);
        // System.out.println(sb.length());
       System.out.println("enter the string you want to reverse ");
       String str = sc.nextLine();
    
        StringBuilder s = new StringBuilder(str);
        String a = "";
        for(int i = s.length()-1;i >= 0;i--){
            a += s.charAt(i);

        }
        System.out.print("the reverse string is :" + a);
    }
}
