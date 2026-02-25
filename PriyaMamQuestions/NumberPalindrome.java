public class NumberPalindrome {
    public static void main(String[] args) {
        
        int n = 121;
        int original = n;
        int rev = 0;

        while(n>0){
            int d = n%10;
            rev = rev*10+d;
            n = n/10;
        }
        if(original==rev){
            System.out.println(rev + " : "+"is a palindrome");
        }
        else{
            System.out.println(rev + " : "+"is not a palindrome");
        }

    }
}
