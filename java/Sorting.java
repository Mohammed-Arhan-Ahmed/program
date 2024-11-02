import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        //there are basics  three types of sorting 
        //bubble sort
        //selection sort
        //

        //code for bubble sort
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the size of array");
        
        int size = sc.nextInt();
        int arr [] = new int[size];
        for(int i = 0;i < size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the array before sorted is");
        for(int i = 0;i < size;i++){
            System.out.println(arr[i]);
        }

        System.out.println("the array after sorted is ");
        // for(int i = 0;i < size;i++){
        //     for(int j = 0;j < size-i-1;j++){
        //     if(arr[j] > arr[j+1]){
        //         int swap = arr[j];
        //         arr[j] = arr[j+1];
        //         arr[j+1] = swap;
        //     }}
        // }
       

        //selection sort
        //here we perform selection sort in which first we take smallest element from the array and then 
        //swap one time unlike bubble sort .
        
        // for(int i = 0;i < arr.length;i++){//4 2 9 1 
        //     int smallest = i;
        //     for(int j = i+1;j < arr.length;j++){    //the mistakes i have done here are 
        //         if(arr[smallest] > arr[j]){         //i have taken direct smallest not arr[smallest]
        //           smallest = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[smallest];
        //     arr[smallest] = temp;
        // }
       

        //the another sort is insertion sort
        //here we divide the array into 2 parts one is sorted and another is unsorted 
        //as the loop runs we pick one element from unsorted array and place it in sorted array

        //selection sort
        for(int i = 1;i <arr.length;i++){
            int current = arr[i];//here it will be second element of array which is arr[1]
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];              // 3 sorting technique time complexity is O(n^2)
                j--;                            //
            }
            //placement
            arr[j+1] = current;//no change
        }
          for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
     }
    }
}
