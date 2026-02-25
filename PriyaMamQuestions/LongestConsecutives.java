public class LongestConsecutives {
    public static void main(String[] args) {
        int arr[] = {100, 4, 200, 1, 3, 2};
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int currentLength = 1;
        int maxlength = 1;

        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]+1){
                currentLength++;
            }else if(arr[i]!=arr[i-1]){
                currentLength=1;
            }
             if(currentLength>maxlength){
            maxlength = currentLength;
        }
        }
       System.out.println(maxlength);

    }
}
