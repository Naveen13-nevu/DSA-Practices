public class RemoveDuplicateString {
    public static void main(String[] args) {
        
        String str = "Naveenttn";
        String result = "";

        for(int i=0;i<str.length();i++){
            boolean isDuplicate = true;

            for(int j=0;j<result.length();j++){
                if(str.charAt(i)==result.charAt(j)){

                    isDuplicate = false;
                    break;

                }
            }
            if(isDuplicate){
                result = result+str.charAt(i);
            }
            
        }
        System.out.print(result);

    }

}
