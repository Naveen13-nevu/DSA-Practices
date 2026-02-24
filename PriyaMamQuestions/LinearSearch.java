
public class LinearSearch {
    public static void main(String[] args) {
        int arr []={1,2,3,4,5};
        int key =5;

        boolean isFound = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("element fount at index: "+ i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found ");
        }


    }
}
