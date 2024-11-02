public class Mergesort{
    public static void merge(int arr[],int si,int mid,int ei){

        //create a new array
        int mergeArray [] = new int [ei - si +1];//the size of the array is lastelement - first element + 1 
        //because indexing start with 0.
        //for track elements we have created the arr1 for first array which is divided and arr2 for other
        //part of the array.and to track new array we created a newarr
        int arr1 = si;
        int arr2 = mid+1;
        int newarr = 0;

       while(arr1 <= mid && arr2 <= ei){
         if(arr[arr1] <= arr[arr2]){
            mergeArray[newarr++] = arr[arr1++];//moving to the next element after adding
         }else{
            mergeArray[newarr++] = arr[arr2++];
         }
       }
       //suppose if one the array is sorted but another is not so we are writeing this for the remeaing part
       //we dont konw which part is completed so we write for both parts
       while(arr1 <= mid){
        mergeArray[newarr++] = arr[arr1++];
       }
       while(arr2 <= ei){
        mergeArray[newarr++] = arr[arr2++];
       }
       
       for(int i = 0,j = si;i<mergeArray.length;i++,j++){
        arr[j] = mergeArray[i];
       }

    }
    public static void mergesort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si) / 2;//to overcome the problem of time complexity
        //its tottaly a divide part
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        //we are merging the divided part
        merge(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int arr [] = {7,9,3,4,2,6};
        int length = arr.length;
        mergesort(arr,0,length-1);
        System.out.println("the sorted array is:");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}