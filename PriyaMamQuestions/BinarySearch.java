public class BinarySearch {

    public static int search(int arr[],int key){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]==key){
                return mid;
            }
            else if (arr[mid]<key) {
                low = mid +1;
            }
            else{
                low = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    int arr[] ={10,20,30,40,50};
    int result =  search(arr, 50);
        if(result!=-1){
            System.out.print("Element found at index: "+ result);
        }
        else{
            System.out.print("Element not found");
        }
    }
}


