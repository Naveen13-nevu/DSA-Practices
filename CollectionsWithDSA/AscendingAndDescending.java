import java.util.*;
public class AscendingAndDescending {
    
    public static void main(String[] args) {
        
        // int arr[] = {9,54,6,7,8,21,5};

        List<Integer> list = new ArrayList<>(Arrays.asList(7,6,5,4,3,29,10));
        Collections.sort(list);
        System.out.println(list+ " ");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list+ " ");


    }
}
