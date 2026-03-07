public class ReplaceChar {
    public static void main(String[] args) {
        
        String str = "banana";
        char ch [] = str.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'){
                ch[i] = 'o';
            }
        }
        for(char p:ch){
            System.out.print(p);
        }

    }
}
