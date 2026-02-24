
public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        int first = arr[0];
        int second = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second =first;
                first = arr[i];
            }
            else if (arr[i]>second && arr[i]!= first) {
                second = arr[i];
            }
        }
        System.out.print("the second largest element is : " + second);
    }
}
