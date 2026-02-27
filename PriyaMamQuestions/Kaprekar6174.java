public class Kaprekar6174 {

    public static void main(String[] args) {

        int num = 3524;   // You can change this number
        int result = 0;

        while (num != 6174) {

            int[] digits = new int[4];
            int temp = num;

            // Step 1: Extract digits
            for (int i = 0; i < 4; i++) {
                digits[i] = temp % 10;
                temp = temp / 10;
            }

            // Step 2: Sort digits in ascending order (manual sorting)
            for (int i = 0; i < 4; i++) {
                for (int j = i + 1; j < 4; j++) {
                    if (digits[i] > digits[j]) {
                        int swap = digits[i];
                        digits[i] = digits[j];
                        digits[j] = swap;
                    }
                }
            }

            // Step 3: Form ascending and descending numbers
            int asc = 0;
            int desc = 0;

            for (int i = 0; i < 4; i++) {
                asc = asc * 10 + digits[i];
            }

            for (int i = 3; i >= 0; i--) {
                desc = desc * 10 + digits[i];
            }

            // Step 4: Subtract
            result = desc - asc;

            System.out.println(desc + " - " + asc + " = " + result);

            num = result;
        }

        System.out.println("Kaprekar Constant Reached: " + num);
    }
}