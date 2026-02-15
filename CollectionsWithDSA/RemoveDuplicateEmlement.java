import java.util.*;
public class RemoveDuplicateEmlement{
    public static void main(String[] args) {
        int arr[] = {1,4,6,5,4,5,4,5,7,8,9,0};

        Set<Integer> set = new LinkedHashSet<>();

        for(int num:arr){
            set.add(num);
        }
        System.err.print(set);
    }
}