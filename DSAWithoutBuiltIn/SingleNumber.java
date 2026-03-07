public class SingleNumber {
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        int n = nums.length;
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(nums[i]);
            }
        } 


    }
}
