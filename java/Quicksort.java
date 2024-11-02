public class Quicksort{
    public static int getPivot(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low - 1;//assign the negative value

        for(int j = low;j < high;j++){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];//first time loop run hua to 7 = 7
                arr[j] = temp;
            }
        }
        //giving the space //assing the pivot
        //create a space
        i++;
        int temp = arr[i];
        arr[i] = arr[high];//when i wrote pivot in place of arr[high] it doesnt work .
        arr[high] = temp;
        return i;//return the index of pivot
    }
    public static void Quicksort(int arr[],int low,int high){
       if(low < high){
        int pi = getPivot(arr,low,high);

        Quicksort(arr, low, pi - 1);
        Quicksort(arr, pi + 1, high);
       }

    }
    public static void main(String[] args) {
        int arr[] = {7,3,9,4,1,5};
        Quicksort(arr,0,arr.length-1);

        //print
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }



        //checking
        // for (int i = 0, j = 5; i < 5; i++) {
        //     j++;                             the reason why i wrote this is beacause i want to check 
        //     System.out.println(i);//whether the i++ in loop and outside of loop is different.the 
        //     System.out.println(j);//working principle is differnet for both of them .the working is
        // }//when we wrote i++ in loop it will first use the value and then increament .but when we
        //use it outside of the for loop syntax it will use the direct increament value as it act like
        //++i;

    }
}