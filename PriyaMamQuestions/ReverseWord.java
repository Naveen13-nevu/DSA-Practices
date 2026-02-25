public class ReverseWord {
    public static void main(String[] args) {
        
        String str = "Java is Easy";
        String word =" ";
      for(int i=str.length()-1;i>=0;i--){
        if(str.charAt(i)!=' '){
            word = str.charAt(i)+word;
        }
        else{
            System.out.print(word);
            word = " ";
        }
      }
      System.out.print(word);

    }
}
