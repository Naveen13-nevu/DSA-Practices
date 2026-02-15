
public class DuplicateValueInString {
    public static void main(String[] args) {
        String str = "Programming";

        for(int i=0;i<str.length();i++){

            boolean isDuplicate = false;
            for(int j=0; j<i;j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    isDuplicate=true;
                    break;
                }
            }
          if(!isDuplicate){
            System.out.print(str.charAt(i)+ " ");
        }
        }
           
       

    }
}
