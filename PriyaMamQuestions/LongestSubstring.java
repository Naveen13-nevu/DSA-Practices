public class LongestSubstring {
    
public static void main(String[] args) {
    
    String str = "abcabbac";
    int max = 0;

    for(int i=0;i<str.length();i++){

        boolean[]visited = new boolean[256];
        int count =0;

        for(int j=0;j<str.length();j++){
            if(visited[str.charAt(j)]){
                break;
            }
            else{
                visited[str.charAt(j)] = true;
                count++;
            }
        }
        if(count >max){
            max = count;
        }
    }
    System.out.println(max);
}
}
