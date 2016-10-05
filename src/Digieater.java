import java.util.*;

public class Digieater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine());
        for(int i = 0; i < cases; i++) {
            char[] num = in.nextLine().toCharArray();
            int sum = 0;
            while(num.length > 1) {
                sum = 0;
                for(int x = 0; x < num.length; x++) {
                    sum += ((int)num[x])-48;
                }
                num = Integer.toString(sum).toCharArray();
            }
            System.out.println(sum);
        }
    }
}
