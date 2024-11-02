import java.util.ArrayList;

//my mindset was that - I want to do the task with recursion when shardha has done with for loop.because 
//i have a ich that loop is an iterative task and recursive is also at iterative task then i can do the loop
//task with recursion but LATER I REALIZE THE MISTAKE THAT THERE ARE SOME CASES WHERE USING LOOP WILL 
//BENEFIT AND SOME TASK WHERE USING RECURSION IS BENEFIT
//Q)FOR WHAT TASK WE HAVE TO USE RECURSION AND LOOP?
// HERE WE HAVE TO SENT THE REAMINING CHARACTER SO WE ARE USING LOOP NOT RECURSION ,WE CAN USE BUT I MAKE 
//THE CODE HARD.



public class Recursion2{
    //1)print all the permutations of a given string
    //"abc" is given the petmutaions are "abc","acb","bca","bac","cab","cba" .these are the total 
    //permutations we can make using "abc".to know how many permutations can make we use n! [n factorial]
    //where n is the length of a given string
    public static void print_permutation(String str,String permutation){
        if(str.length() == 0){              //my mistake here was i have kept -1 to str.legth()-1 which 
                                             //executes one time less   
            System.out.println(permutation);
            return;
        }
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            //if "abc"there we have to only pass "bc"
            //so to make this we using substring () method
            String newstr = str.substring(0,i) + str.substring(i+1);
            print_permutation(newstr, permutation + c);
        }
    }
    //COUNT the total paths in a maze(matrix) from (0,0)[firstbox] to (n,m)[last box]
    //rules to be followed are we can go only in 2 directions either it may be down or right
    // public static int count_paths(int i,int j,int n,int m){
    //     if(i == n || j == m){
    //         return 0;
    //     }
    //     if(i == n-1 && j == m-1){
    //         return 1;//inside it counting the levels of stack so rcount = 3 and dcount = 3
    //     }               //so 3+3 will be six.each level of stack will return 1.
    //     //moving right
    //     int rcount = count_paths(i+1, j, n, m);
    //     //moving down
    //     int dcount = count_paths(i, j+1, n, m);
    //     //we have to return total paths so we are adding rightpaths and down paths
    //     return rcount + dcount;
    // }
    
    //3)calculate the number of ways to arrange the tails of size 1 x m in the matrix[room] of size n x m
    // public static int print_waysToArrange(int n,int m){
    //     if(n == m){
    //         return 2;
    //     }
    //     if(n < m){
    //         return 1;
    //     }
    //     //the tails can be arranged in horizontal order and vertical order
    //     //horizontal order - when we arranged horizontal then we have to call n-1
    //     int horizontal = print_waysToArrange(n-1, m);

    //     //vertical order
    //     int vertical = print_waysToArrange((n-m), m);

    //     return horizontal + vertical;
    // }

    //4) make pairs of people in which they will be single or pair wise the number of people will be n,here  = 4
    // here we have to print the number of ways the people go / make
    // public static int make_pair(int n){
    //     if(n <= 0){
    //         return 1;
    //     }
    //     //if they want to go in single //total there are four persons 
    //     int single = make_pair(n-1); //if they went single 3

    //     //if they want to go in a pair

    //     int pair = (n-1) * make_pair(n-2); 

    //     return single + pair;

    // }
    //print all the subsets of a sets of n natural numbers
    public static void print_set(ArrayList<Integer> set){
        for(int i = 0;i<set.size();i++){
            System.out.print(set);
            System.out.println();
            return;
           
        }
       
    }
    public static void subset_ofSets(ArrayList<Integer> set,int n){
        if(n == 0){
           print_set(set);
            return;
        }
        //adding elements in to set
        set.add(n);
        subset_ofSets(set, n-1);

        // removing from the set and printing them as the got removed
        set.remove(set.size() - 1);
        //not adding elements
        subset_ofSets(set, n-1);
    }
    public static void main(String[] args) {
        // String str = "arhan";
        // System.out.println(str.substring(0,0)); its a doubt i have that (0,0) will print what but it print nothing
       // print_permutation("abc", "");
      //int ans =  count_paths(0, 0, 3, 3);
      //System.out.println("the total paths are :" + ans);
    //   int ways = print_waysToArrange(4, 2);
    //   System.out.println("the number of ways to place tiles are :" + ways);

    // int pairs = make_pair(4);
    // System.out.println("the numbers of ways we can make are : " + pairs);
    ArrayList<Integer> set = new ArrayList<>();

    subset_ofSets(set, 3);

    }
}