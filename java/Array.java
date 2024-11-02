import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr [] = new int[size];
        for(int i = 0;i < size;i++){//dont keep = sign when you use array 
            System.out.println("enter the " + i + " element :");
            arr[i] = sc.nextInt();
        }
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        min = arr[0];//3 4 5 6
        max = arr[0];
        for(int i = 0;i < size;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("the minimum value of array is : " + min);
        System.out.println("the maximum value of array is : " + max);
        //check whether the given array is sorted or not in ascending
        boolean isSorted = false;
        for(int i = 0;i < arr.length-1;i++){//if u get an error aioob or you have to chck one element to one+1
            //element -to solve get the array length and subtract - 1 from it.
            if(arr[i] > arr[i+1]){
                isSorted = true;
            }
        }
        if(!isSorted){
            System.out.println("the enterd array is sorted");
        }else{
            System.out.println("the array is not sorted");
        }
    }
}