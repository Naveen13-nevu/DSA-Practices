
public class RemoveDupElements {
    public static void main(String[] args) {
        
        int arr []= {1,1,2,3,3,4,5,5,};

        for(int i=0;i<arr.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<i;j++){
                if(i != j && arr[i]==arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
