public class ReverseaString {
    public static void main(String[] args) {
        
        String str  = "Naveen";
        char [] ch = str.toCharArray();
        int left = 0;
        int right = str.length()-1;

        while(left<right){
            char temp = ch[left];
            ch[left]=ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        System.out.print(new String(ch));


    }
}
