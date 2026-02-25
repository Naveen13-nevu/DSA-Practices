public class MinimumPlatform {
    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        int n = arrival.length;
        for(int i =0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arrival[j]>arrival[j+1]){
                    int temp = arrival[j];
                    arrival[j]=arrival[j+1];
                    arrival[j+1]=temp;
                }
                if(departure[j]>departure[j+1]){
                    int temp = departure[j];
                    departure[j]=departure[j+1];
                    departure[j+1]=temp;
                }
               
            }

            
        }

        int i=0,j=0;
        int platform =0,maxPlatform=0;

        while(i<n && j<n){
            if(arrival[i]<=departure[j]){
                platform++;
                i++;
            }
            else{
                platform--;
                j++;
            }
            if(platform>maxPlatform){
                maxPlatform=platform;
            }
        }
        System.out.println(maxPlatform);
    }
}
