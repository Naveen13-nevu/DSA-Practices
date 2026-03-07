public class MoveRight_K {
    public static void main(String[] args) {
        
        int arr[]= {1,2,3,4,5};
        int n = arr.length;
        int k=2;

        int result[] = new int[n];
        int index =0;

        for(int i=n-k;i<n;i++){
            result[index++] = arr[i];
            // index++;
        }

        for(int i=0;i<n-k;i++){
            result[index++]=arr[i];
            // index++;
        }

        for(int p: result){

            System.out.print(p+" ");
        }

    }
}
