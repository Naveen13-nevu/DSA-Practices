

public class RemoveDuplicateElement {
public static void main(String[] args) {
    
    int arr [] = {1,2,3,3,4,4,5,6,7,8,8};

    for(int i=0;i<arr.length;i++){
        boolean isDuplicate = true;

        for(int j=0;j<i;j++){
            if(arr[i]==arr[j]){
                isDuplicate = false;
                break;
            }
        }
        if(isDuplicate){
            System.out.println(arr[i]+ " ");
        }

    }




}

}
