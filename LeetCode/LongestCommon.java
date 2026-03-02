
public class LongestCommon{
    public static void main(String[] args) {
        
        String []arr = {"flower", "flow", "flight"};
        if(arr.length==0){
            System.out.println(" ");
            return;
        }
        String first = arr[0];
        String result = "";

        for(int i=0;i<first.length();i++){
            char ch = first.charAt(i);
            for(int j=1;j<arr.length;j++){
                if(i>= arr[j].length() || arr[j].charAt(i)!=ch){
                    System.out.println(result);
                    return;
                }
            }
            result = result+ch;
            }
            System.out.println(result);
        }
    }
   
