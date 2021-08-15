import java.util.*;

public class rep {
    public static void main(String[] args) {
        int n = 123500340;
        System.out.println(replace(n));
    }

    public static int replace(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                arr[i] = '5';
            }
        }
        return Integer.parseInt(new String(arr));

    }

}
