
public class RemoveDuplicatesString {
    
public static void main(String[] args) {
    
    String str = "Naveen";
    for(int i=0;i<str.length();i++){
        boolean isDup = false;
        for(int j=0;j<i;j++){
            if(i != j && str.charAt(i)==str.charAt(j)){
                isDup = true;
                break;
            }
        }
        if(!isDup){
            System.out.print(str.charAt(i)+" ");
        }
    }

}

}
